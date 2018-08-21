package com.service;

import com.bean.Storeclassify;
import com.bean.StoreclassifyExample;
import com.dao.StoreclassifyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreclassifyService {
    @Autowired
    StoreclassifyMapper storeclassifyMapper;

    //查询分类下的种类
    public List<Storeclassify> findStoreclassify(String stId) {
        StoreclassifyExample example = new StoreclassifyExample();
        StoreclassifyExample.Criteria criteria = example.createCriteria();
        criteria.andScBelongEqualTo(stId);
        List<Storeclassify> storeclassifies = storeclassifyMapper.selectByExample(example);
        return storeclassifies;

    }
}
