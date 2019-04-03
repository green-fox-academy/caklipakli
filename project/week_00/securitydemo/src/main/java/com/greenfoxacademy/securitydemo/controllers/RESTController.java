package com.greenfoxacademy.securitydemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController("/rest/hello")
public class RESTController {

        @RequestMapping("/all")
        public String hello(){
            return "Hello world";
        }

        @RequestMapping("/secured/all")
        public String securedHello(){
            return "This is a secured Hello world";
        }
}
