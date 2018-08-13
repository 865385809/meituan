package com.controller;

import com.bean.Comments;
import com.service.CommentsSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/commentsController")
public class CommentsComtroller {

    @Autowired
    CommentsSerivce commentsSerivce;

    //创建评论
    @RequestMapping("/creatCommen")
    public String creatCommen(Comments comments){
        commentsSerivce.creatCommen(comments);
        return "redirect:/storeController/homeSearch";
    }
}
