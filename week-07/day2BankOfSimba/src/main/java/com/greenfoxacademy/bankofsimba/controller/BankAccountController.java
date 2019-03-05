package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.model.BankAccountsList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    BankAccountsList bankOfSavanna = new BankAccountsList();

    @RequestMapping("/show")
    public String show(Model model){

        BankAccount accountSimba = new BankAccount("Simba", 2000.5687f, "lion", "zebra");
        model.addAttribute("account", accountSimba);
        return "index";
    }

    @RequestMapping("/htmltext")
    public String htmlText(Model model){

        model.addAttribute("message", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmltext";
    }

    @RequestMapping("/accounts")
    public String showAccounts(Model model){

        model.addAttribute("accountsList", bankOfSavanna.getBankOfSavanna());
        return "accounts";
    }
}
