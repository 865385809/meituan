package com.controller;

import com.bean.Goods;
import com.bean.Store;
import com.service.GoodsService;
import com.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/goodsController")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @Autowired
    StoreService storeService;

    //商品列表
    @RequestMapping("/goodList")
    public String toAddGoods(HttpServletRequest request,Model model){
        String stoId = request.getParameter("stoId");
        List<Goods> goods = goodsService.findGoodsByStoreId(Integer.parseInt(stoId));
        model.addAttribute("goods",goods);
        return "seller/store_goodList";
    }
    //添加订单
    @RequestMapping("/creatOrder")
    public String creatOrder(HttpServletRequest request){
        String godId = request.getParameter("godId");
        String stoId = (String) request.getParameter("stoId");
        String stoName = (String) request.getParameter("stoName");
        Goods goods = goodsService.findGoods(Integer.parseInt(godId));
        request.setAttribute("stoName",stoName);
        request.setAttribute("stoId",stoId);
        request.setAttribute("godName",goods.getGodName());
        request.setAttribute("godPrice",goods.getGodPrice());
        request.setAttribute("godPicture",goods.getGodPicture());
        request.setAttribute("godId",goods.getGodId());
        return "seller/goods_order";
    }

    //查询对应商店的商品
    @RequestMapping("/findGoodsByStoreId")
    public String findGoodsByStoreId(@RequestParam(value = "stoId") Integer stoId , Model model
            , HttpServletResponse response,HttpServletRequest request){
//        //组织ID
//        //取得Cookies数据
//        Cookie[] cookies = request.getCookies();
//        //如果不为空说明有历史
//        Cookie historyStore = null;
//        if(cookies!=null){
//            for (int i = 0;i<cookies.length;i++){
//                //查找有没有name叫historyStoreId的cookie
//                if("historyStoreId".equals(cookies[i].getName())){
//                    historyStore = cookies[i];
//                }
//            }
//        }
//        //有历史的cookie
//        if(historyStore!=null){
//            //转化为数组
//            String value = historyStore.getValue();
//            String[] values = value.split("-");
//            LinkedList<String> list = new LinkedList<String>(Arrays.asList(values));
//            //还不够3位就找到相同的删除
//            if(list.size()<3){
//                if (list.contains(stoId)){
//                    list.remove(stoId);
//                }
//            //已经够3位先找相同的删除，没有就直接删除最后一个
//            }else {
//                if (list.contains(stoId)){
//                    list.remove(stoId);
//                }else {
//                    list.removeLast();
//                }
//            }
//            list.addFirst(stoId);
//            StringBuffer sb = new StringBuffer();
//            for (int i = 0;i<list.size();i++){
//                if (i>0){
//                    sb.append("-");
//                }
//                sb.append(list.get(i));
//            }
//        }
//
//        //历史记录的ID
//        String historyStoreId = "1";
//        Cookie ck = new Cookie("historyStoreId",historyStoreId);
//        ck.setPath("/");
//        ck.setMaxAge(Integer.MAX_VALUE);    //设置Cookie的保存时间
//        response.addCookie(ck);


        //搜索商店的信息
        Store store = storeService.findStore(stoId);
        //搜索出所有的商品
        List<Goods> goodsList = goodsService.findGoodsByStoreId(stoId);
        model.addAttribute("store",store).addAttribute("goodsList",goodsList);
        return "seller/seller_goods";
    }
}
