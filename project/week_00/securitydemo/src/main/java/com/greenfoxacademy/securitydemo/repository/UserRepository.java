package com.greenfoxacademy.securitydemo.repository;

import com.greenfoxacademy.securitydemo.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {
}
