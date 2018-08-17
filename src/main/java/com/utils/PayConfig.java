/*
package com.utils;
import java.io.FileWriter;
import java.io.IOException;
//PayConfig
*/
/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 *//*

public class PayConfig{
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091800538432";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCRcJi1qI8BOgBz8SeQLj9K4VTzrowgctmMV/PqmWvWiGUU4s08kGvAaFTEPqyTLyeD5F4blKWRn7akcNEg+QlQCH8DES0RF6G86r2SSEx7S3mho7/gSMOPpt0yOHgab4eaOvIjXgY2NB/AmD6oq6p6etHy8oI9a2GiHWaAcYjhOHZ+7+Ibk7zJ8XlnSJkbgP00GyPs37fd8p3ws3xO7qpxDSzEjCx5cJsjZX8Gf9rgje3gdeBAtOOnl7CvGzIra+m5rHdrfXffNxf1jVap/oK7hxiBCK5Nj2SLwmcjLeXLim1b5dG2l9onrK1nm8Lyeq2iymavtu6fGWxmduwyYCmJAgMBAAECggEAS0Okk2WeU7krYNSsb62vLVX8u3pZo7UrpbgiTwaESuocvTk9kpj+Wfzj2QbCEgz1+wgkN0uufvTS9Lg5UUHvMs6iw/iQhObg2T31So1FnwyI7kAqXKvrIBzvHT0h0jRjTUox4mGW/1fsEqP20Ry9RVLn8TzUb2pxhQ6H6/JVLo9cgVQJ1opJz+8WmEB2YMq9r8OPAA3wBeS3R7BoKi0NcFjbXMQgMdSP4stQ2xMNsjTuVMqCn9S8RMspwXIEEBx0WJkL6VuWv9gbA5jbCTeyvTK/P6/yZtsBNjcdscljbd0xJRhXc9JYLT1Wdy5/Kx/QXihJDf5T6SZ0seYBWy/o7QKBgQDOXuQnNPN3lz83bLUIb9vy5E1+l15j01ONwgx9rs+cDtCFlk9nUdQzhAgJQARNYhWGhqYrv8+sOFwtVrBttHroirTF1o7PaEtOcboVahdB7kGOWSmC+0XI27QqgyTxC62HLMif+767F8vOIUmR4auaVsnJy8n6f/efvYPpmMVhowKBgQC0aoc2D9TH8py2ADrK5WFvKwa2bwyORxuSIWKCmlCmvDmuZF63Dgv4dM5sOUrtrBo+DHkMNFSXN9zQ0ut8BdWEk3ZhVTqAnSd49kAoHu83hpnX0wUg/USl/zwQKLA/O+gbuMqBmNZMXMbDz2P+08A/MLuqTTDpWLruwLx08KBy4wKBgEe95zTWDJmTg8+BxAF12ZG72lDa0F6FtbM/NVZv8g5/e/Aky9/QK6PpD14f2h8IrRECODxXRxvI0AqW62iH6H500dlA+I6T5DIWCSmuov0xlaqlxm+ZaK4l6qEozCvb8mxenjQ3sRubbydunQPQ3vYdm7LCXKnv2Ka4nGYVzPBfAoGBALMY9TSjrpT2sL6zp6l236xdyAIeZxZuXF5KKeKAkgOS4qfOF4Acv6FbQveIQGuD52ElPJzy7e5XlCrw1rd9iyJayK+CzdqTJ3Ya7kFlxA8Y3Wu0nWjMQvOOVe+slJmRPK8YWF8ie8m+Z8pF/HwhdLzGAeXjTuS2IouUZQCpRn4FAoGAPJ4tWx384EpeuHDNGtlxShR8+7fhMEXLq5CO5rc1vaF6h8p3OUg6XnxUvE7YnhBejqSZL+zj9F+dbZ3qZjLLD1LRYQtmRDdCRYZvUCagaVqkTYYj9GjP2Esg3RqyRvT1jZAeoHvVp3ipFRhzmUhBQuCx0EE+5cdYdSf+lRCARHU=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv3WgluCBvbRjkeas1Ve2Isqk6mkCBqQzxf730WRBtvff3yfWpzQwiZO00dSKvh5/3Gri41VIAkIUnyvD7h955c0hho0f7dYPe1TMFlSDasqRf8NKFXtKg/C3lzUrap7/4iGO4HbVr1ZrIsc88bXJhNs+RkU8CAuLa+4ywCZwHmQmLpJpjCRvjj7bkQqF1JjLMHgKEWkMVfmBGcw0qazbPxTfgmDfNjRwiQjcKvTfj5DxcWyd0YCVEqKZFzOR1wOC6hqYHBkBoEW0HOERQOk1CSzgnKmyqk3DR1da40RWgr07PdrTh5yLjq7S5mU+tdFtlUuUjo3yykbWy/+iot0hFQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://leechenxiang.xicp.io/alipayController/alipayNotifyNotice";
    //public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://leechenxiang.xicp.io/alipayController/alipayReturnNotice";
    //public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 支付宝网关
    public static String log_path = "C:\\";
//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    */
/**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     *//*

    //AlipayConfig
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

*/
