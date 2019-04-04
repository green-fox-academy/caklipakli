package com.greenfoxacademy.securitydemo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RESTController {

        @RequestMapping("/all")
        public String hello(){
            return "Hello world";
        }

        @PreAuthorize("hasAnyRole('ADMIN')")
        @RequestMapping("/secured/all")
        public String securedHello(){
            return "This is a secured Hello world";
        }
}
