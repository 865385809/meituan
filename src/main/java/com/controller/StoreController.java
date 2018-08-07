package com.controller;

import com.bean.Store;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.StoreService;
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

    //分页搜索商店
    @RequestMapping("/searchShop")
    public ModelAndView searchShop(@RequestParam(value = "pn",defaultValue = "1")Integer pn,
                                   Model model,Store store) throws Exception {
        // 在查询之前只需要调用，传入页码，以及每页的大小
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pn, 5);
        List<Store> stores = storeService.searchShop(store.getStoType(),store.getStoClassify());
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
        modelAndView.addObject("setStoClassify",store.getStoClassify());
        modelAndView.setViewName("seller/seller_search");
        return modelAndView;
    }
}
