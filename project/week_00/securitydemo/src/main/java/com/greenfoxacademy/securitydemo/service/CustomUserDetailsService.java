package com.greenfoxacademy.securitydemo.service;

import com.greenfoxacademy.securitydemo.models.CustomUserDetails;
import com.greenfoxacademy.securitydemo.models.Users;
import com.greenfoxacademy.securitydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Optional<Users> optionalUsers = usersRepository.findByName(username);
        optionalUsers
                .orElseThrow(()-> new UsernameNotFoundException("There's no such username"));
        return optionalUsers
                .map(CustomUserDetails::new).get();
    }
}
