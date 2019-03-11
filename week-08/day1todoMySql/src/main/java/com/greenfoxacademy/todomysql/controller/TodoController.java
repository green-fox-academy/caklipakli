package com.greenfoxacademy.todomysql.controller;

import com.greenfoxacademy.todomysql.model.Todo;
import com.greenfoxacademy.todomysql.repository.TodoRepository;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
            model.addAttribute("todos",repository.findAll());

            return "todolist";
        }

        @RequestMapping(path="/add", method= RequestMethod.GET)
        public String todoForm(Model model){
            model.addAttribute("todo", new Todo());
            return "todoform";
        }

        @RequestMapping(path="/add", method=RequestMethod.POST)
        public String todoAdd(@ModelAttribute(name="todo") Todo todo){
            repository.save(todo);
            return "redirect:/todo/list";
        }

}
