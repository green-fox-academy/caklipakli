package com.greenfoxacademy.smallproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurityController {

    @RequestMapping("/")
    public String HelloWorld(){
        return "Hello world";
    }

    @RequestMapping("/notprotected")
    public String HelloAgain(){
        return "Hello from a not protected page.";
    }

    @RequestMapping("/protectedByUserRole")
    public String HelloUser(){
        return "Hello User role!";
    }

    @RequestMapping("/protectedByAdminRole")
    public String HelloAdmin(){
        return "Hello Admin role!";
    }

}
