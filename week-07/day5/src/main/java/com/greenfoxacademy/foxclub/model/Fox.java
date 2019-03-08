package com.greenfoxacademy.foxclub.model;

public class Fox {

    private String name;
    private String food;
    private String drink;
    private Tricks tricks;

    public Fox(String name){
        this.name= name;
        this.drink= "kóla";
    }

    public Fox(String name, String food, String drink, Tricks tricks){
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.tricks = tricks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Tricks getTricks() {
        return tricks;
    }

    public void setTricks(Tricks tricks) {
        this.tricks = tricks;
    }

    public void addTrick(String trick){
        tricks.addTricktoTricks(trick);
    }
}
