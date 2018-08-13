package com.service;

import com.bean.Store;
import com.bean.StoreExample;
import com.dao.StoreMapper;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    StoreMapper storeMapper;

    //分页查询商店
    public List<Store> searchShop( String stoType, String stoClassify,String stoName) throws Exception {
        StoreExample example = new StoreExample();
        StoreExample.Criteria criteria = example.createCriteria();
        //种类有值才加进去
        if (!StringUtils.isNullOrEmpty(stoClassify)){
            criteria.andStoClassifyLike("%" + stoClassify + "%");
        }
        if (!StringUtils.isNullOrEmpty(stoType)){
            criteria.andStoTypeLike("%" + stoType + "%");
        }
        if (!StringUtils.isNullOrEmpty(stoName)){
            criteria.andStoNameLike("%" + stoName + "%");
        }
        List<Store> storeList = storeMapper.selectByExample(example);
        return storeList;
    }

    //查询商品
    public Store findStore(Integer stoId) {
        Store store = storeMapper.selectByPrimaryKey(stoId);
        return store;
    }

    //主页的查询
    public List<Store> homeSearch(String type) {
        StoreExample example = new StoreExample();
        StoreExample.Criteria criteria = example.createCriteria();
        criteria.andStoTypeEqualTo(type);
        List<Store> stores = storeMapper.selectByExample(example);
        return stores;
    }

    //开店
    public void openStore(Store store) {
        storeMapper.insertSelective(store);
    }

    //查询商户拥有的商店
    public List<Store> storeCenter(Integer seller_id) {
        StoreExample example = new StoreExample();
        StoreExample.Criteria criteria = example.createCriteria();
        criteria.andSellerIdEqualTo(seller_id);
        List<Store> stores = storeMapper.selectByExample(example);
        return stores;
    }
}
