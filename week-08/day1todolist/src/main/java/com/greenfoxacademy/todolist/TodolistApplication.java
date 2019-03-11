package com.greenfoxacademy.todolist;

import com.greenfoxacademy.todolist.model.Todo;
import com.greenfoxacademy.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {

    private TodoRepository repository;
    @Autowired
    public TodolistApplication(TodoRepository repository){
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Todo("Start the day"));
        repository.save(new Todo("Finish workshop H2"));
        repository.save(new Todo("Finish workshop JPA"));
        repository.save(new Todo("Create CRUD project"));
    }
}
