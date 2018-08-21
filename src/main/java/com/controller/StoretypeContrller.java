package com.controller;

import com.bean.City;
import com.bean.Provinced;
import com.bean.Storeclassify;
import com.bean.Storetype;
import com.service.StoreclassifyService;
import com.service.StoretypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/storetypeContrller")
public class StoretypeContrller {
    @Autowired
    StoretypeService storetypeService;
    @Autowired
    StoreclassifyService storeclassifyService;

    @RequestMapping("/findStoretype")
    @ResponseBody
    public Object findStoretype(Model model) {
        List<Storetype> storetype=storetypeService.findStoretype();
        return storetype;
    }
    @RequestMapping(value="/findStoreclassify/{stId}")
    @ResponseBody
    public Object findStoreclassify(@PathVariable("stId") String stId, Model model) throws IOException {
        List<Storeclassify> storeclassify = storeclassifyService.findStoreclassify(stId);
        return storeclassify;
    }
}
