package com.service;

import com.bean.Seller;
import com.bean.SellerExample;
import com.dao.SellerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    @Autowired
    SellerMapper sellerMapper;

    //商户注册
    public void sellerRegister(Seller seller) {
        sellerMapper.insertSelective(seller);
    }

    //商家登陆
    public Seller sellerLogin(String sUsername, String sPassword) {
        SellerExample example =new SellerExample();
        SellerExample.Criteria criteria = example.createCriteria();
        criteria.andSUsernameEqualTo(sUsername).andSPasswordEqualTo(sPassword);
        Seller seller = sellerMapper.selectBySellerExample(example);
        return seller;
    }
}
