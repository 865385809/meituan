package com.dao;

import com.bean.Provinced;
import com.bean.ProvincedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvincedMapper {
    long countByExample(ProvincedExample example);

    int deleteByExample(ProvincedExample example);

    int deleteByPrimaryKey(Integer prId);

    int insert(Provinced record);

    int insertSelective(Provinced record);

    List<Provinced> selectByExample(ProvincedExample example);

    Provinced selectByPrimaryKey(Integer prId);

    int updateByExampleSelective(@Param("record") Provinced record, @Param("example") ProvincedExample example);

    int updateByExample(@Param("record") Provinced record, @Param("example") ProvincedExample example);

    int updateByPrimaryKeySelective(Provinced record);

    int updateByPrimaryKey(Provinced record);
}