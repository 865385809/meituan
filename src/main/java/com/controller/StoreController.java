package com.controller;

import com.bean.Store;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.StoreService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/storeController")
public class StoreController {

    @Autowired
    StoreService storeService;

    //返回首页
    //转发到主页显示的搜索
    @RequestMapping("/homeSearch")
    public String homeSearch(Model model){
        PageHelper.startPage(1, 7);
        List<Store> stores1 = storeService.homeSearch("电影");
        PageHelper.startPage(1, 7);
        List<Store> stores2 = storeService.homeSearch("美食");
        PageHelper.startPage(1, 7);
        List<Store> stores3 = storeService.homeSearch("酒店");
        //将List转换成对象数组
        Store[] movieStore = new Store[stores1.size()];
        movieStore = stores1.toArray(movieStore);
        Store[] foodStore = new Store[stores2.size()];
        foodStore = stores2.toArray(foodStore);
        Store[] hotelStore = new Store[stores3.size()];
        hotelStore = stores3.toArray(hotelStore);
        System.out.println("#############"  + movieStore);
        System.out.println("#############"  + foodStore);
        System.out.println("#############"  + hotelStore);
        model.addAttribute("movieStore",movieStore);
        model.addAttribute("foodStore",foodStore);
        model.addAttribute("hotelStore",hotelStore);
        return "/home";
    }
    //分页搜索商店
    @RequestMapping("/searchShop")
    public ModelAndView searchShop(@RequestParam(value = "pn",defaultValue = "1")Integer pn,
                                   Model model,Store store) throws Exception {
        // 在查询之前只需要调用，传入页码，以及每页的大小
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pn, 5);
        System.out.println("s###########stoName + " + store.getStoName());
        List<Store> stores = storeService.searchShop(store.getStoType(),store.getStoClassify(),store.getStoName());
        //包含的分页的详细信息，以及每次显示多少页
        PageInfo storeListInfo = new PageInfo(stores, 5);
        JSONArray json = JSONArray.fromObject(storeListInfo.getNavigatepageNums());//将java对象转换为json对象
        String str = json.toString();//将json对象转换为字符串
        //将页数导航转换为json数据才能够解析
        modelAndView.addObject("navigateNums", str);
        //分页携带的信息
        modelAndView.addObject("storeListInfo", storeListInfo);
        //把正在搜索的信息传回去
        modelAndView.addObject("searchStoType",store.getStoType());
        modelAndView.addObject("searchStoName",store.getStoName());
        modelAndView.addObject("setStoClassify",store.getStoClassify());
        modelAndView.setViewName("seller/seller_search");
        return modelAndView;
    }
}
