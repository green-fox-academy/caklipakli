package com.greenfoxacademy.restexercises.repository;

import com.greenfoxacademy.restexercises.model.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}
