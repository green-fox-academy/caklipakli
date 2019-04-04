package com.greenfoxacademy.securitydemo.repository;

import com.greenfoxacademy.securitydemo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
