package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class BankAccountsList {

    private List<BankAccount> bankOfSavanna = new ArrayList<>();

    public BankAccountsList(){

        bankOfSavanna.add(new BankAccount("Simba", 2000.5687f, "lion", "zebra", true));
        bankOfSavanna.add(new BankAccount("Zazu", 200.5687f, "hornbill", "fruit", false));
        bankOfSavanna.add(new BankAccount("Nala", 2005.5687f, "lion", "zebra", false));
        bankOfSavanna.add(new BankAccount("Timon", 20005.5687f, "meerkats", "insect", false));
        bankOfSavanna.add(new BankAccount("Muszafa", 1000.5687f, "lion", "zebra", false));
    }

    public List<BankAccount> getBankOfSavanna() {
        return bankOfSavanna;
    }
}
