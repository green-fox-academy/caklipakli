package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

    BankAccount accountSimba = new BankAccount("Simba", 2000.5687f, "lion", "zebra");

    @RequestMapping("/show")
    public String show(Model model){

        model.addAttribute("account", accountSimba);
        return "index";
    }
}
