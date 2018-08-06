package com.dao;

import com.bean.Member;
import com.bean.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(Member record);

    int insertSelective(Member record);
    //导入
    int insertInfoBatch(List<Member> record);

    List<Member> selectByExample(MemberExample example);
    //登陆
    Member selectMemberByExample(MemberExample example);

    Member selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}