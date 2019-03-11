package com.greenfoxacademy.todolist.controller;

import com.greenfoxacademy.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository repository;

    @Autowired
    public TodoController(TodoRepository repository){
        this.repository = repository;
    }


    @RequestMapping(value={"/", "/list"})
    public String list(Model model){

        return "todolist";
    }
}
