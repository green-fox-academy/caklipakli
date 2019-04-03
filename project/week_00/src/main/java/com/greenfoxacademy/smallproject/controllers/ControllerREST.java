package com.greenfoxacademy.smallproject.controllers;

import com.greenfoxacademy.smallproject.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerREST {

        private HelloService helloService;

        @Autowired
        public ControllerREST(HelloService helloService) {
            this.helloService = helloService;
        }

        @GetMapping("/hello")
        public String helloWorld() {
            return helloService.getHelloWorld();
        }
}
