package com.dao;

import com.bean.Storeclassify;
import com.bean.StoreclassifyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreclassifyMapper {
    long countByExample(StoreclassifyExample example);

    int deleteByExample(StoreclassifyExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(Storeclassify record);

    int insertSelective(Storeclassify record);

    List<Storeclassify> selectByExample(StoreclassifyExample example);

    Storeclassify selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") Storeclassify record, @Param("example") StoreclassifyExample example);

    int updateByExample(@Param("record") Storeclassify record, @Param("example") StoreclassifyExample example);

    int updateByPrimaryKeySelective(Storeclassify record);

    int updateByPrimaryKey(Storeclassify record);
}