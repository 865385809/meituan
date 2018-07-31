package com.service;

import com.bean.Member;
import com.dao.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired              //没有配置可能导致空指针异常
    MemberMapper memberMapper;

    //分页查询会员数据
    public List<Member> findAllMember() {
        return memberMapper.selectByExample(null);
    }
    //插入会员
    public void saveMember(Member member) {
        memberMapper.insertSelective(member);
    }
}
