package com.greenfoxacademy.securitydemo.repository;

import com.greenfoxacademy.securitydemo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
