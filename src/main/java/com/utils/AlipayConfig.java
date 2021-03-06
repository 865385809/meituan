package com.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by acer on 2018/8/21.
 */
public class AlipayConfig {
    public static String app_id = "2016091800538432";
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCRcJi1qI8BOgBz8SeQLj9K4VTzrowgctmMV/PqmWvWiGUU4s08kGvAaFTEPqyTLyeD5F4blKWRn7akcNEg+QlQCH8DES0RF6G86r2SSEx7S3mho7/gSMOPpt0yOHgab4eaOvIjXgY2NB/AmD6oq6p6etHy8oI9a2GiHWaAcYjhOHZ+7+Ibk7zJ8XlnSJkbgP00GyPs37fd8p3ws3xO7qpxDSzEjCx5cJsjZX8Gf9rgje3gdeBAtOOnl7CvGzIra+m5rHdrfXffNxf1jVap/oK7hxiBCK5Nj2SLwmcjLeXLim1b5dG2l9onrK1nm8Lyeq2iymavtu6fGWxmduwyYCmJAgMBAAECggEAS0Okk2WeU7krYNSsb62vLVX8u3pZo7UrpbgiTwaESuocvTk9kpj+Wfzj2QbCEgz1+wgkN0uufvTS9Lg5UUHvMs6iw/iQhObg2T31So1FnwyI7kAqXKvrIBzvHT0h0jRjTUox4mGW/1fsEqP20Ry9RVLn8TzUb2pxhQ6H6/JVLo9cgVQJ1opJz+8WmEB2YMq9r8OPAA3wBeS3R7BoKi0NcFjbXMQgMdSP4stQ2xMNsjTuVMqCn9S8RMspwXIEEBx0WJkL6VuWv9gbA5jbCTeyvTK/P6/yZtsBNjcdscljbd0xJRhXc9JYLT1Wdy5/Kx/QXihJDf5T6SZ0seYBWy/o7QKBgQDOXuQnNPN3lz83bLUIb9vy5E1+l15j01ONwgx9rs+cDtCFlk9nUdQzhAgJQARNYhWGhqYrv8+sOFwtVrBttHroirTF1o7PaEtOcboVahdB7kGOWSmC+0XI27QqgyTxC62HLMif+767F8vOIUmR4auaVsnJy8n6f/efvYPpmMVhowKBgQC0aoc2D9TH8py2ADrK5WFvKwa2bwyORxuSIWKCmlCmvDmuZF63Dgv4dM5sOUrtrBo+DHkMNFSXN9zQ0ut8BdWEk3ZhVTqAnSd49kAoHu83hpnX0wUg/USl/zwQKLA/O+gbuMqBmNZMXMbDz2P+08A/MLuqTTDpWLruwLx08KBy4wKBgEe95zTWDJmTg8+BxAF12ZG72lDa0F6FtbM/NVZv8g5/e/Aky9/QK6PpD14f2h8IrRECODxXRxvI0AqW62iH6H500dlA+I6T5DIWCSmuov0xlaqlxm+ZaK4l6qEozCvb8mxenjQ3sRubbydunQPQ3vYdm7LCXKnv2Ka4nGYVzPBfAoGBALMY9TSjrpT2sL6zp6l236xdyAIeZxZuXF5KKeKAkgOS4qfOF4Acv6FbQveIQGuD52ElPJzy7e5XlCrw1rd9iyJayK+CzdqTJ3Ya7kFlxA8Y3Wu0nWjMQvOOVe+slJmRPK8YWF8ie8m+Z8pF/HwhdLzGAeXjTuS2IouUZQCpRn4FAoGAPJ4tWx384EpeuHDNGtlxShR8+7fhMEXLq5CO5rc1vaF6h8p3OUg6XnxUvE7YnhBejqSZL+zj9F+dbZ3qZjLLD1LRYQtmRDdCRYZvUCagaVqkTYYj9GjP2Esg3RqyRvT1jZAeoHvVp3ipFRhzmUhBQuCx0EE+5cdYdSf+lRCARHU=";
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv3WgluCBvbRjkeas1Ve2Isqk6mkCBqQzxf730WRBtvff3yfWpzQwiZO00dSKvh5/3Gri41VIAkIUnyvD7h955c0hho0f7dYPe1TMFlSDasqRf8NKFXtKg/C3lzUrap7/4iGO4HbVr1ZrIsc88bXJhNs+RkU8CAuLa+4ywCZwHmQmLpJpjCRvjj7bkQqF1JjLMHgKEWkMVfmBGcw0qazbPxTfgmDfNjRwiQjcKvTfj5DxcWyd0YCVEqKZFzOR1wOC6hqYHBkBoEW0HOERQOk1CSzgnKmyqk3DR1da40RWgr07PdrTh5yLjq7S5mU+tdFtlUuUjo3yykbWy/+iot0hFQIDAQAB";
    public static String notify_url = "http://39.108.217.202:8080/alipayController/alipayNotifyNotice";
    public static String return_url = "http://39.108.217.202:8080/alipayController/alipayReturnNotice";
    public static String sign_type = "RSA2";
    public static String charset = "utf-8";
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
//    public AlipayConfig() throws UnknownHostException {
//        InetAddress addr = InetAddress.getLocalHost();
//        String ip=addr.getHostAddress();//获得本机IP
//        notify_url = "http://"+ip+":8080/alipayController/alipayNotifyNotice";
//        return_url = "http://"+ip+":8080/alipayController/alipayReturnNotice";
//        System.out.println("############ip" + ip);
//    }
}
