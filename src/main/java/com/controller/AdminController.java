package com.controller;

import com.bean.Admin;
import com.service.AdminSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/adminController")
public class AdminController {
    @Autowired
    AdminSerivce adminSerivce;

    //跳转到登陆页面
    @RequestMapping("toAdminLogin")
    public String toAdminLogin(){
        return "admin/admin_login";
    }
    //登陆
    @RequestMapping("/adminLogin")
    public String adminLogin(String admUsername, String admPassword, HttpServletRequest request){
        Admin admin = adminSerivce.adminLogin(admUsername,admPassword);
        if (admin==null){
           return  "redirect:/storeController/homeSearch";
        }
        request.getSession().setAttribute("admin",admin);
        return "redirect:/memberController/memberAllList";
    }
}
