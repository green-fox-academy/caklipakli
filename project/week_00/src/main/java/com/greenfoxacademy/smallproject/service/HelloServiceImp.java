package com.greenfoxacademy.smallproject.service;


import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService {

    public String getHelloWorld() {
        return "Hello World!";
    }
}
