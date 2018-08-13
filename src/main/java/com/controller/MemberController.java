package com.controller;

import com.bean.Member;
import com.bean.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.MemberService;
import com.utils.MailUtils;
import com.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/memberController")
public class MemberController {

    @Autowired
    MemberService memberService;


    //发送邮件
    @RequestMapping("/sendMail")
    public String sendMail() throws MessagingException {
        MailUtils.secdMail("2621372230@qq.com","ogcrugzbxtjfbbhc");
        return "redirect:/member/member_login.jsp";
    }
    //登陆注销
    @RequestMapping("/memberLoginOut")
    public String memberLoginOut(HttpServletRequest request){
        request.getSession().removeAttribute("member");
        System.out.println("正常退出");
        return "redirect:/index.jsp";
    }
    //登陆
    @RequestMapping("/selectMember")
    public String selectMember(HttpServletRequest request, String mUsername, String mPassword){
        Member member = memberService.selectMember(mUsername, mPassword);
        request.getSession().setAttribute("member",member);
        return "redirect:/index.jsp";
    }
    //跳转至注册的隐私条款
    @RequestMapping("/toCopyRight")
    public String toCopyRight(){
        return "member/member_copyright";
    }
    //跳转至登陆页面
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "member/member_login";
    }
    //跳转至注册页面
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "member/member_register";
    }
    //选择删除
    @RequestMapping(value="/deleteMemberById/{m_id}",method=RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteMemberById(@PathVariable("m_id")String  m_id){
        if (m_id.contains("-")){
            List<Integer> in_ids = new ArrayList<Integer>();
            String[] m_ids = m_id.split("-");
            for (String item :m_ids){
                in_ids.add(Integer.parseInt(item));
            }
            memberService.deleteBatch(in_ids);
        }else {
            Integer id = Integer.parseInt(m_id);
            memberService.deleteMemberById(id);
        }
        return Msg.success();
    }

    //修改前查询会员数据
    @RequestMapping(value="/findMember/{m_id}",method=RequestMethod.GET)
    @ResponseBody
    public Msg findMember(@PathVariable("m_id")Integer m_id){
        Member member = memberService.findMember(m_id);
        return Msg.success().add("member", member);
    }
    //修改会员数据
    @ResponseBody
    @RequestMapping(value = "/updateMember/{mId}",method = RequestMethod.PUT)
    public Msg updateMember(Member member){
        memberService.updateMember(member);
        return Msg.success();
    }
    //检查用户名是否可用
    @ResponseBody
    @RequestMapping("/checkmember")
    public Msg checkmember(@RequestParam("membername") String membername){
        String regx = "^([a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)";
        if(!membername.matches(regx)){
            return Msg.fail().add("va_msg","用户名可以是2-5位中文或者6-16位英文和数字的组合");
        }
        boolean b = memberService.checkmember(membername);
        if (b){
            return Msg.success();
        }else{
            return Msg.fail().add("va_msg","用户名不可用");
        }
    }
    //添加员工，JSR303校验，注册
    @RequestMapping(value = "/member_save",method = RequestMethod.POST)
//    @ResponseBody
    //@Valid Member member, BindingResult result
    public String saveMember(Member member,MultipartFile upload,HttpServletRequest request) throws IOException {
        //上传图片
        if(upload.getSize()!=0) {
            String newFileName = UploadUtil.uploadFile(request,upload);
            member.setmPicture("/static/upload/"+newFileName);
        }
        //System.out.println("%%%%%%%%%%%%%%%%%%%" +result.hasErrors());
//        if (result.hasErrors()){
//            Map<String, Object> map = new HashMap<>();
//            List<FieldError> errors = result.getFieldErrors();
//            for (FieldError fieldError : errors) {
//                System.out.println("错误的字段名："+fieldError.getField());
//                System.out.println("错误信息："+fieldError.getDefaultMessage());
//                map.put(fieldError.getField(), fieldError.getDefaultMessage());
//            }
//            return Msg.fail().add("errorFields", map);
//        }else{
        System.out.println("#########getmPicture##+"+member.getmPicture());
            memberService.saveMember(member);
//            return Msg.success();
            return "/member/member_login";
//        }
    }
    //Ajax的分页查询
    //页面的转发
    @RequestMapping("/memberAllList")
    public String adminfind(){
        return "admin/memberAllList";
    }
    //直接返回PageInfo对象，@ResponseBody可以把返回的对象转为josn字符串
    @RequestMapping("/findAllMemberJson")
    @ResponseBody
    public Msg findAllMemberJson(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
        List<Member> memberList = memberService.findAllMember();
        //包含的分页的详细信息，以及每次显示多少页
        PageInfo memberListPage = new PageInfo(memberList, 5);
        return Msg.success().add("memberListPage",memberListPage);
    }

    //分页查询
    @RequestMapping("/findAllMember")
    public String findAllMember(@RequestParam(value = "pn",defaultValue = "1")Integer pn,
                                Model model){
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
        List<Member> memberList = memberService.findAllMember();
        //包含的分页的详细信息，以及每次显示多少页
        PageInfo memberListPage = new PageInfo(memberList, 5);
        model.addAttribute("memberListPage", memberListPage);
        return "admin/memberList";
    }

}
