package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    BankAccount accountSimba = new BankAccount("Simba", 2000.5687f, "lion", "zebra");
    BankAccount accountZazu = new BankAccount("Zazu", 200.5687f, "hornbill", "fruit");
    BankAccount accountNala = new BankAccount("Nala", 2005.5687f, "lion", "zebra");
    BankAccount accountTimon = new BankAccount("Timon", 20005.5687f, "meerkats", "insect");
    BankAccount accountMuszafa = new BankAccount("Muszafa", 1000.5687f, "lion", "zebra");

    List<BankAccount> bankAccounts = new ArrayList<>();



    @RequestMapping("/show")
    public String show(Model model){

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

        bankAccounts.add(accountSimba);
        bankAccounts.add(accountMuszafa);
        bankAccounts.add(accountNala);
        bankAccounts.add(accountTimon);
        bankAccounts.add(accountZazu);

        model.addAttribute("accountsList", bankAccounts);
        return "accounts";
    }
}
