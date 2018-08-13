package com.controller;

import com.utils.PayConfigInfo;
import com.utils.PaymentUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/payController")
public class PayController {

    @RequestMapping("/toPayPage")
    public String toPayPage(){
        return "pay/paySubmit";
    }
    @RequestMapping("/paySubmit")
    public String paySubmit(HttpServletRequest request, HttpServletResponse response){
        String orderid = request.getParameter("orderid");//订单号
        String amount = request.getParameter("amount");//支付金额
        String pd_FrpId = request.getParameter("pd_FrpId");//选择的支付银行
        String p1_MerId = PayConfigInfo.getValue("p1_MerId");//编号
        String keyValue = PayConfigInfo.getValue("keyValue");//密钥
        String merchantCallbackURL = PayConfigInfo.getValue("merchantCallbackURL");
        String messageType = "Buy"; // 请求命令,在线支付固定为Buy
        String currency = "CNY"; // 货币单位
        String productDesc = ""; // 商品描述
        String productCat = ""; // 商品种类
        String productId = ""; // 商品ID
        String addressFlag = "0"; // 需要填写送货信息 0：不需要 1:需要
        String sMctProperties = ""; // 商家扩展信息
        String pr_NeedResponse = "0"; // 应答机制
        //获得md5-hmac签名
        String md5hmac = PaymentUtil.buildHmac(messageType, p1_MerId, orderid, amount, currency,
                productId, productCat, productDesc, merchantCallbackURL, addressFlag, sMctProperties,
                pd_FrpId, pr_NeedResponse, keyValue);

        System.out.println("@@@@@@@@@@编号@@@@@@@@@@" + p1_MerId);
        System.out.println("@@@@@@@@@@密钥@@@@@@@@@@" + keyValue);
        System.out.println("@@@@@@@@@@支付金额@@@@@@@@@@" + amount);
        System.out.println("@@@@@@@@@@订单号@@@@@@@@@@" + orderid);
        System.out.println("@@@@@@@@@@选择的支付银行@@@@@@@@@@" + pd_FrpId);
        System.out.println("@@@@@@@@@@@获得md5-hmac签名@@@@@@@@@" + md5hmac);
        request.setAttribute("messageType", messageType);
        request.setAttribute("merchantID", p1_MerId);
        request.setAttribute("orderId", orderid);
        request.setAttribute("amount", amount);
        request.setAttribute("currency", currency);
        request.setAttribute("productId", productId);
        request.setAttribute("productCat", productCat);
        request.setAttribute("productDesc", productDesc);
        request.setAttribute("merchantCallbackURL", merchantCallbackURL);
        request.setAttribute("addressFlag", addressFlag);
        request.setAttribute("sMctProperties", sMctProperties);
        request.setAttribute("frpId", pd_FrpId);
        request.setAttribute("pr_NeedResponse", pr_NeedResponse);
        request.setAttribute("hmac", md5hmac);

        return "pay/connection";
    }
}
