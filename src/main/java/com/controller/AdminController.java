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

    /**
     * 跳转到登陆页面
     * @return
     */
    @RequestMapping("toAdminLogin")
    public String toAdminLogin(){
        return "admin/admin_login";
    }

    /**
     * 登陆方法
     * @param admUsername
     * @param admPassword
     * @param request
     * @return
     */
    @RequestMapping("/adminLogin")
    public String adminLogin(String admUsername, String admPassword, HttpServletRequest request){
        Admin admin = adminSerivce.adminLogin(admUsername,admPassword);
        //后台校验
        Integer error  = 0;
        if(admUsername==""){
            error=1;
            request.setAttribute("username","*用户名不能为空");
        }
        if(admPassword==""){
            error=1;
            request.setAttribute("password","*密码不能为空");
        }
        //账号密码错误
        if(admin==null&error!=1){
            error=1;
            request.setAttribute("message","账号或密码错误");
        }
        if(error!=0){
            return "admin/admin_login";
        }
        request.getSession().setAttribute("admin",admin);
        return "redirect:/memberController/memberAllList";
    }
}
