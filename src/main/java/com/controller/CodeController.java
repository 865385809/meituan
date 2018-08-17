//手机短信的Controller类
package com.controller;
import com.bean.ReturnContant;
import com.utils.GetMessageCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/codeController")
public class CodeController {

    @Resource
    private ReturnContant returnContant;
    /**
     * 根据获取到的手机号发送验证码
     * @param request
     * @param phone 获取的手机号码
     * @return
     */
    @RequestMapping(value="/sendSMS",method= RequestMethod.POST)
    public @ResponseBody ReturnContant sendSMS(HttpServletRequest request, String phone){
        //根据获取到的手机号发送验证码
        String code= GetMessageCode.getCode(phone);
        returnContant.setStatus(1);
        returnContant.setData(code);
        return returnContant;
    }
}