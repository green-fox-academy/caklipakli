package com.greenfoxacademy.smallproject.service;


import com.greenfoxacademy.smallproject.models.User;
import com.greenfoxacademy.smallproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloUserServiceImp implements HelloService {

    private UserRepository userRepository;

    public HelloUserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public String getHelloWorld() {
        return "Hello World!";
    }
}
