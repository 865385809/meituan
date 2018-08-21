package com.service;

import com.bean.Country;
import com.bean.CountryExample;
import com.dao.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryMapper countryMapper;

    public List<Country> findCountryByName(String ciId) {
        CountryExample example = new CountryExample();
        CountryExample.Criteria criteria = example.createCriteria();
        criteria.andCoBelongEqualTo(ciId);
        List<Country> countries = countryMapper.selectByExample(example);
        return countries;
    }
}
