package com.greenfoxacademy.springstart.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Webshop {

    @RequestMapping(value ="/webshop")
    public String webshop(){

        return "webshop";
    }

}
