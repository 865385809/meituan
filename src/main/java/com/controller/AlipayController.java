package com.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.bean.Orders;
import com.service.OrdersService;
import com.utils.AlipayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping("/alipayController")
public class AlipayController {

    Integer odr_id ;
    //final static Logger log = LoggerFactory.getLogger(OrdersController.class);
    @Autowired
    OrdersService ordersService;

    @RequestMapping(value = "/goAlipay/{orderId}", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String goAlipay(@PathVariable("orderId") Integer orderId, HttpServletRequest request) throws UnsupportedEncodingException, AlipayApiException {
        odr_id = orderId;
        //得到对象
        Orders order = ordersService.findOrderById(orderId);
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        //同步页面
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        //异步页面
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = order.getOdrNumber();
        //付款金额，必填
        //String.valueOf(order.getOdrPrice())
        //String.valueOf("0.01")
        String total_amount = String.valueOf(order.getOdrPrice());
        //订单名称，必填
        String subject = order.getOdrName();
        //订单的时间
        String timeout_express = "1c";
        //商品描述，可空
        String body = "用户订购的商品个数：" + order.getGodCount();
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"timeout_express\":\"" + timeout_express + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        //输出
        //out.println(result);
        return result;
    }
    //同步接口
    @RequestMapping(value = "/alipayReturnNotice")
    public String alipayReturnNotice(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("支付完成进入同步通知接口");
        PrintWriter out = response.getWriter();
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名
        //——请在这里编写您的程序（以下代码仅作参考）——
        if(signVerified) {
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
            //付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
            out.println("trade_no:"+trade_no+"<br/>out_trade_no:"+out_trade_no+"<br/>total_amount:"+total_amount);

            Orders order1 = ordersService.findOrderById(odr_id);
            order1.setOdrPaystate("1");
            order1.setPaytime(new Date());
            ordersService.updateOrder(order1);
        }else {
            out.println("验签失败");
        }
        return "redirect:/storeController/homeSearch";
    }
    //异步接口
    @RequestMapping(value = "/alipayNotifyNotice")
    public String alipayNotifyNotice() throws Exception{
        System.out.println("支付完成进入异步通知接口");
        return "";
    }
}
