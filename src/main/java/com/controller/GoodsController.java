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

import java.util.List;

@Controller
@RequestMapping("/goodsController")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @Autowired
    StoreService storeService;

    @RequestMapping("/creatOrder")
    public String creatOrder(){
        return "seller/goods_order";
    }

    @RequestMapping("/findGoodsByStoreId")
    public String findGoodsByStoreId(@RequestParam(value = "stoId") Integer stoId , Model model){
        //搜索商店的信息
        Store store = storeService.findStore(stoId);
        //搜索出所有的商品
        List<Goods> goodsList = goodsService.findGoodsByStoreId(stoId);

        System.out.println("@@@@@@商品记录条数：" + goodsList.size());
        model.addAttribute("store",store).addAttribute("goodsList",goodsList);
        return "seller/seller_goods";
    }
}
