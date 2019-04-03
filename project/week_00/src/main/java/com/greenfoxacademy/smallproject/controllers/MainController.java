package com.greenfoxacademy.smallproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String main(){
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage(Model model){
        return "login";
    }

    @RequestMapping("/hi")
    public String getHi(){
        return "hi";
    }
}
