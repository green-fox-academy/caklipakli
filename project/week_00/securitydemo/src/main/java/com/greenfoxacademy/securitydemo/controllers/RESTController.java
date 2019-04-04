package com.greenfoxacademy.securitydemo.controllers;

import com.greenfoxacademy.securitydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RESTController {

    private UserService userService;

    @Autowired
    public RESTController(UserService userService){
        this.userService = userService;
    }

        @RequestMapping("/all")
        public String hello(){
            return "Hello world";
        }

        @PreAuthorize("hasAnyRole('ADMIN')")
        @RequestMapping("/secured/all")
        public String securedHello(){
            return "This is a secured Hello world";
        }


        @RequestMapping("/secured/list")
        public Object listUsers(){
            return userService.getAllUsers();
        }


}
