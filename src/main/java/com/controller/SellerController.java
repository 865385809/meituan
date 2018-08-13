package com.controller;

import com.bean.Goods;
import com.bean.Seller;
import com.bean.Store;
import com.service.GoodsService;
import com.service.SellerService;
import com.service.StoreService;
import com.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RequestMapping("/sellerController")
@Controller
public class SellerController {
    @Autowired
    SellerService sellerService;
    @Autowired
    StoreService storeService;
    @Autowired
    GoodsService goodsService;

    //跳转到添加商品
    @RequestMapping("/toAddGoods")
    public String toAddGoods(HttpServletRequest request,Model model){
        model.addAttribute("stoId",request.getParameter("stoId"));
        return "seller/store_addgoods";
    }
    //搜索商品列表
    //添加商品
    @RequestMapping("/addGoods")
    public String addGoods( Goods goods, MultipartFile upload, HttpServletRequest request) throws IOException {
        if(upload.getSize()!=0) {
            String newFileName = UploadUtil.uploadFile(request,upload);
            goods.setGodPicture("/static/upload/"+newFileName);
        }
        goodsService.addGoods(goods);
        return "redirect:/sellerController/storeCenter";
    }
    //登陆成功后来到商店中心
    @RequestMapping("/storeCenter")
    public String storeCenter(HttpServletRequest request, Model model){
        Seller seller = (Seller) request.getSession().getAttribute("seller");
        if (seller==null){
            return "redirect:/sellerController/toSellerLogin";
        }
        List<Store> stores = storeService.storeCenter(seller.getsId());
        System.out.println("############" + stores);
        request.setAttribute("stores",stores);
//        model.addAttribute("stores",stores);
        return "seller/seller_center";
    }
    //开店
    @RequestMapping("/openStore")
    public String openStore(Store store,MultipartFile upload,HttpServletRequest request) throws IOException {
        System.out.println("$$$$$$" + store.getStoName());
        System.out.println("$$$$$$" + store.getStoAddress());
        if(upload.getSize()!=0) {
            String newFileName = UploadUtil.uploadFile(request,upload);
            store.setStoPicture("/static/upload/"+newFileName);
        }
        System.out.println("$$$$$$" + store.getStoPicture());

        storeService.openStore(store);
        return "redirect:/sellerController/storeCenter";
    }
    //退出登陆
    @RequestMapping("/sellerLogout")
    public String sellerLogout(HttpServletRequest request){
        request.getSession().removeAttribute("seller");
        return "redirect:/storeController/homeSearch";
    }
    //商家登陆,登陆完去查数据库
    @RequestMapping("/sellerLogin")
    public String sellerLogin(String sUsername, String sPassword, HttpServletRequest request){
        Seller seller = sellerService.sellerLogin(sUsername,sPassword);
        request.getSession().setAttribute("seller",seller);
        return "redirect:/sellerController/storeCenter";
    }
    //商家注册 ,返回首页
    @RequestMapping("/sellerRegister")
    public String sellerRegister(Seller seller){
        sellerService.sellerRegister(seller);
        return "redirect:/storeController/homeSearch";
    }

    //跳转到开店页面
    @RequestMapping("/toOpenStore")
    public String toOpenStore(){
        return "seller/seller_openStore";
    }
    //跳转到登陆页面
    @RequestMapping("/toSellerLogin")
    public String toSellerLogin(){
        return "seller/seller_login";
    }
    //跳转到注册页面
    @RequestMapping("/toSellerRegister")
    public String toSellerRegister(){
        return "seller/seller_register";
    }

}
