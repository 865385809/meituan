package com.service;

import com.bean.Orders;
import com.bean.OrdersExample;
import com.dao.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    @Autowired
    OrdersMapper ordersMapper;

    //添加订单
    public void addOrder(Orders orders) {
        ordersMapper.insertSelective(orders);
    }

    //通过用户ID找订单
    public List<Orders> selectOrderByMemberId(int mId) {
        OrdersExample example = new OrdersExample();
        OrdersExample.Criteria criteria = example.createCriteria();
        criteria.andMbrIdEqualTo(mId);
        List<Orders> orders = ordersMapper.selectByExample(example);
        return orders;
    }
//    //找到未付款订单
//    public List<Orders> selectOrderByPayState() {
//        OrdersExample example = new OrdersExample();
//        OrdersExample.Criteria criteria = example.createCriteria();
//        criteria.andOdrPaystateEqualTo(0);
//        List<Orders> orders = ordersMapper.selectByExample(example);
//        return orders;
//    }
//    //找到未使用的订单
//    public List<Orders> selectOrderByUserState() {
//        OrdersExample example = new OrdersExample();
//        OrdersExample.Criteria criteria = example.createCriteria();
//        criteria.andOdrUserstateEqualTo(0);
//        List<Orders> orders = ordersMapper.selectByExample(example);
//        return orders;
//    }
//    //找到未评价的订单
//    public List<Orders> selectOrderByIsEva() {
//        OrdersExample example = new OrdersExample();
//        OrdersExample.Criteria criteria = example.createCriteria();
//        criteria.andIsEvaluationEqualTo(0);
//        List<Orders> orders = ordersMapper.selectByExample(example);
//        return orders;
//    }
}
