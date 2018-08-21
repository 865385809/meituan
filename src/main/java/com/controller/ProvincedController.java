////三级联动省市区
//package com.controller;
//
//import java.io.IOException;
//import java.util.List;
//
//import com.bean.Provinced;
//import com.service.ProvincedService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class ProvincedController {
//    @Autowired
//    private ProvincedService provincedService;
//    @RequestMapping("findProvince")
//    public String findProvince(Model model) {
//        List<Provinced> province=provincedService.findProvince();
//        model.addAttribute("province",province);
//        return "comovement";
//    }
//    @RequestMapping(value="/testjson1/{pr_name}",method=RequestMethod.GET)
//    @ResponseBody
//    public Object testJson1( @PathVariable("pr_name") String pr_name,Model model) throws IOException{
//        List<Comovement> city=comovementService.findCityByName(pr_name);
//        return city;
//    }
//    @RequestMapping(value="/testjson2/{ci_name}",method=RequestMethod.GET)
//    @ResponseBody
//    public Object testJson2(@PathVariable("ci_name") String ci_name,Model model) throws IOException{
//        List<Comovement> county=comovementService.findCountyByName(ci_name);
//        return county;
//    }
//}
