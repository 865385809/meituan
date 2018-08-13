package com.service;

import com.bean.Comments;
import com.dao.CommentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsSerivce {
    @Autowired
    CommentsMapper commentsMapper;

    //创建评论
    public void creatCommen(Comments comments) {
        commentsMapper.insertSelective(comments);
    }
}
