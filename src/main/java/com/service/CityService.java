package com.service;

import com.bean.City;
import com.bean.CityExample;
import com.dao.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;

    //查询城市
    public List<City> findCityById(String prId) {
        CityExample example = new CityExample();
        CityExample.Criteria criteria = example.createCriteria();
        criteria.andCiBelongEqualTo(prId);
        List<City> cities = cityMapper.selectByExample(example);
        return cities;
    }
}
