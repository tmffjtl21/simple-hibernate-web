package com.tjlee.hibernate.controller;

import com.tjlee.hibernate.service.HibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HibernateController {

    @Autowired
    public HibernateService hibernateService;

    @GetMapping("/test")
    public String main(){
        hibernateService.getCategory();
        return "";
    }
}
