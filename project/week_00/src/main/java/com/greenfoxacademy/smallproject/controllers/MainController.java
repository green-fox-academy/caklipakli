package com.greenfoxacademy.smallproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String Home(){
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
