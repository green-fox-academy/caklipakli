package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private String currency;
    private boolean isKing;

    public BankAccount(String name, float balance, String animalType, String currency, boolean isKing){
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.isKing = isKing;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {

        return balance;
    }

    public String getFormattedBalance(){
        String formattedBalance = String.format("%.02f", balance);
        return formattedBalance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCurrency() {
        return currency;
    }
}
