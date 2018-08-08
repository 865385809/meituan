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
    public List<Store> searchShop(String stoType,String stoClassify) throws Exception {
        StoreExample example = new StoreExample();
        StoreExample.Criteria criteria = example.createCriteria();
        //种类有值才加进去
        if (!StringUtils.isNullOrEmpty(stoClassify)){
            criteria.andStoClassifyLike("%" + stoClassify + "%");
        }
        if (!StringUtils.isNullOrEmpty(stoType)){
            criteria.andStoTypeLike("%" + stoType + "%");
        }
        List<Store> storeList = storeMapper.selectByExample(example);
        return storeList;
    }

    //查询商品
    public Store findStore(Integer stoId) {
        Store store = storeMapper.selectByPrimaryKey(stoId);
        return store;
    }
}
