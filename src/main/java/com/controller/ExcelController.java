package com.controller;

import com.service.ExcelService;
import com.utils.ExcelUtil;
import com.utils.ViewExcel;
import org.apache.http.ParseException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.beans.IntrospectionException;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;

@RequestMapping("/excelController")
@Controller
public class ExcelController {
    @Autowired
    ExcelService excelService;

    @RequestMapping(value="/upLoadPayerCreditInfoExcel",method={RequestMethod.GET,RequestMethod.POST})
    public void uploadPayerCreditInfoExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("upfile");
        if(file.isEmpty()){
            throw new Exception("文件不存在！");
        }
        InputStream in = file.getInputStream();
        excelService.uploadPayerCreditInfoExcel(in,file);
        in.close();
        PrintWriter out = null;
        response.setCharacterEncoding("utf-8");  //防止ajax接受到的中文信息乱码
        out = response.getWriter();
        out.print("文件导入成功！");
        out.flush();
        out.close();
    }

    //excel表的导出
    @RequestMapping("/excelExport")
    public ModelAndView excelExport(ModelMap map) throws Exception{
        List<Map<String,String>> list = excelService.selectAllMemberInfo();
        String[] titles={"编号","用户名","密码","邮箱","手机号"};
        ViewExcel excel=new ViewExcel(titles);
        map.put("excelList", list);
        return new ModelAndView(excel,map);
    }
}
