package com.controller;

import com.bean.Member;
import com.bean.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by acer on 2018/7/28.
 */
@Controller
public class MemberController {

    @Autowired
    MemberService memberService;


    //添加员工
    @RequestMapping(value = "/member_save",method = RequestMethod.POST)
    @ResponseBody
    public Msg saveMember(Member member){
        memberService.saveMember(member);
        return Msg.success();
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
        System.out.println("asfaaaaaaaaaaaasf");
        PageHelper.startPage(pn, 5);
        List<Member> memberList = memberService.findAllMember();
        System.out.println("##########################");
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
