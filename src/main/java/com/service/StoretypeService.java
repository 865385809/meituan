package com.service;

import com.bean.City;
import com.bean.Provinced;
import com.bean.Storetype;
import com.dao.StoretypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StoretypeService {
    @Autowired
    StoretypeMapper storetypeMapper;

//查询商店类型
    public List<Storetype> findStoretype() {
        List<Storetype> storetypes = storetypeMapper.selectByExample(null);
        return storetypes;
    }
}
