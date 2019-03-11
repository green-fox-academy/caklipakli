package com.greenfoxacademy.todomysql.controller;

import com.greenfoxacademy.todomysql.model.Todo;
import com.greenfoxacademy.todomysql.repository.TodoRepository;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

        @RequestMapping(path ="/{id}/delete", method=RequestMethod.GET)
        public String todoDelete(@PathVariable("id") long id) {
            repository.deleteById(id);
            return "redirect:/todo/list";
        }


        @RequestMapping(path ="/{id}/edit", method=RequestMethod.GET)
        public String todoEditForm(Model model, @PathVariable("id") long id) {
            model.addAttribute("todo",repository.findById(id).get());
            return "redirect:/todo/edit";
        }

        @RequestMapping(path ="/{id}/edit", method=RequestMethod.POST)
        public String todoEdit(@ModelAttribute(name="todo") Todo todo) {
            repository.save(todo);
            return "redirect:/todo/list";
    }
}
