package com.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *@program: bookShopping
 *@description: 邮件
 *@author: myy
 */
public class MailUtils {

    /*
    *@param [toMail, code]收件人 激活码
    *@return void
    */
    public static void secdMail(String toMail, String code) throws MessagingException {
        //设置邮件服务器
        Properties properties = new Properties();
        //可以设置邮件服务器
        properties.setProperty("mail.host","smtp.qq.com");
        properties.setProperty("mail.smtp.auth","true");
        //与邮件服务器的连接
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("865385809@qq.com","ogcrugzbxtjfbbhc");
            }
        });

        //创建邮件
        Message message = new MimeMessage(session);
        //设置收件人地址
        message.setFrom(new InternetAddress("865385809@qq.com"));
        //抄送
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(toMail));
        //设置邮件的主体
        message.setSubject("这是一封来自假美团的邮件，请注意！！！");
        //设置内容
        String msg="<h1>点击<a href='http://localhost:8080/book/users/activation.action?code="+code+"'>此处</a>激活账户<h1>";
        message.setContent(msg, "text/html;charset=utf-8");
        //发送邮件
        Transport.send(message);
    }
}