package com.greenfoxacademy.securitydemo.service;

import com.greenfoxacademy.securitydemo.models.Users;
import com.greenfoxacademy.securitydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(Users user) {
        userRepository.save(user);
    }

    public List<Users> getUsers() {
        List<Users> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
    }


}
