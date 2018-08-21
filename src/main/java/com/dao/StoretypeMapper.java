package com.dao;

import com.bean.Storetype;
import com.bean.StoretypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoretypeMapper {
    long countByExample(StoretypeExample example);

    int deleteByExample(StoretypeExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(Storetype record);

    int insertSelective(Storetype record);

    List<Storetype> selectByExample(StoretypeExample example);

    Storetype selectByPrimaryKey(Integer stId);

    int updateByExampleSelective(@Param("record") Storetype record, @Param("example") StoretypeExample example);

    int updateByExample(@Param("record") Storetype record, @Param("example") StoretypeExample example);

    int updateByPrimaryKeySelective(Storetype record);

    int updateByPrimaryKey(Storetype record);
}