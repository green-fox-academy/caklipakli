package com.greenfoxacademy.todomysql.repository;

import com.greenfoxacademy.todomysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
