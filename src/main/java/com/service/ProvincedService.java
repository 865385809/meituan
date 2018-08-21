package com.service;

import com.bean.Provinced;
import com.dao.ProvincedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvincedService {
    @Autowired
    ProvincedMapper provincedMapper;
//    搜索省份
    public List<Provinced> findProvinced() {
        List<Provinced> provinceds = provincedMapper.selectByExample(null);
        return provinceds;
    }
}
