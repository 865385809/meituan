package com.service;

import com.bean.Member;
import com.bean.MemberExample;
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
    //检验用户名是否可用
    public boolean checkmember(String membername) {
        MemberExample example = new MemberExample();
        MemberExample.Criteria criteria = example.createCriteria();
        criteria.andMUsernameEqualTo(membername);
        long count = memberMapper.countByExample(example);
        return count==0;
    }
    //更新之前调用查看数据
    public Member findMember(Integer m_id) {
        Member member = memberMapper.selectByPrimaryKey(m_id);
        return member;
    }
    //会员的更新
    public void updateMember(Member member) {
        memberMapper.updateByPrimaryKeySelective(member);
    }

    //会员的删除
    public void deleteMemberById(Integer m_id) {
        memberMapper.deleteByPrimaryKey(m_id);
    }
    //批量删除
    public void deleteBatch(List<Integer> m_ids) {
        MemberExample example = new MemberExample();
        MemberExample.Criteria criteria = example.createCriteria();
        criteria.andMIdIn(m_ids);
        memberMapper.deleteByExample(example);
    }
}
