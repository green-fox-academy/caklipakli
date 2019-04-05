package com.greenfoxacademy.smallproject.controllers;

import com.greenfoxacademy.smallproject.models.UserNotFoundException;
import com.greenfoxacademy.smallproject.models.User;
import com.greenfoxacademy.smallproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserRESTController {

    private UserRepository userRepository;

    @Autowired
    public UserRESTController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> listUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User listUserById(@PathVariable int id) throws UserNotFoundException {
        Optional<User> user = userRepository.findById(id);

        if (!user.isPresent())
            throw new UserNotFoundException("No user with this ID: " + id);

        return user.get();
    }

    @PostMapping("/users")
    public ResponseEntity<Object> addUser(@RequestBody User user){
        User savedUser = userRepository.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
