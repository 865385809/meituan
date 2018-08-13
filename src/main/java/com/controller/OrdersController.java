package com.controller;

import com.bean.Orders;
import com.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/ordersController")
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    //转发到评论
    @RequestMapping("/toCreatComment")
    public String toCreatComment(HttpServletRequest request){
        String goodsId = request.getParameter("goodsId");
        String storeId = request.getParameter("storeId");
        request.setAttribute("goodsId",goodsId);
        request.setAttribute("storeId",storeId);
        System.out.println("#######" + goodsId);
        return "order/order_comments";
    }

    //转发到个人中心
    @RequestMapping("/memberCenter")
    public String memberCenter(Model model, HttpServletRequest request){
        if (request.getSession().getAttribute("member")==null){
            return "member/member_login";
        }
        //搜索全部订单
        List<Orders> allOrders = ordersService.selectOrderByMemberId(1);
//        List<Orders> noPayOrders = ordersService.selectOrderByPayState();
//        List<Orders> noUserOrders = ordersService.selectOrderByUserState();
//        List<Orders> noEvaOrders = ordersService.selectOrderByIsEva();
        model.addAttribute("allOrders",allOrders);
//        model.addAttribute("noPayOrders",noPayOrders);
//        model.addAttribute("noUserOrders",noUserOrders);
//        model.addAttribute("noEvaOrders",noEvaOrders);
        return "member/member_center";
    }
    //生成订单
    @RequestMapping("/addOrder")
    public String addOrder(Orders orders){
        //随机生成订单号
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        //System.out.println("##########订单号：" + String.format("%015d", hashCodeV));
        orders.setOdrNumber(String.format("%015d", hashCodeV));
        orders.setOdrData(new Date());
        ordersService.addOrder(orders);
        return "redirect:/index.jsp";
    }
}
