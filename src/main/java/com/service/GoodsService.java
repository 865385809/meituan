package com.service;

import com.bean.Goods;
import com.bean.GoodsExample;
import com.dao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    //根据商店ID搜索所有商品
    public List<Goods> findGoodsByStoreId(Integer stoId) {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(stoId);
        List<Goods> goodsList = goodsMapper.selectByExample(example);
        return goodsList;
    }

    //搜索商品信息
    public Goods findGoods(Integer godId) {
        Goods goods = goodsMapper.selectByPrimaryKey(godId);
        return goods;
    }

    //添加商品到商店
    public void addGoods(Goods goods) {
        goodsMapper.insertSelective(goods);
    }

//    //搜索商品列表
//    public List<Goods> toAddGoods(int stoId) {
//        GoodsExample example = new GoodsExample();
//        GoodsExample.Criteria criteria = example.createCriteria();
//        criteria.andStoreIdEqualTo(stoId);
//        List<Goods> goods = goodsMapper.selectByExample(example);
//        return goods;
//    }
}
