package com.service;

import com.bean.Admin;
import com.bean.AdminExample;
import com.dao.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminSerivce {
    @Autowired
    AdminMapper adminMapper;

    public Admin adminLogin(String admUsername, String admPassword) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdmUsernameEqualTo(admUsername).andAdmPasswordEqualTo(admPassword);
        Admin admin = adminMapper.selectAdminByExample(example);
        return admin;
    }
}
