package com.greenfoxacademy.springstart.model;

public class ShopItem implements Comparable<ShopItem>{

    private String name;
    private String description;
    private int price;
    private int quantity;

    public ShopItem(String name, String description, int price, int quantity){

        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ShopItem o) {

        return this.price - o.getPrice();
    }
}
