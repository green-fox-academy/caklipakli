package com.greenfoxacademy.smallproject.service;


import com.greenfoxacademy.smallproject.models.User;
import com.greenfoxacademy.smallproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloUserServiceImp implements HelloService {

    public String getHelloWorld() {
        return "Hello World!";
    }
}
