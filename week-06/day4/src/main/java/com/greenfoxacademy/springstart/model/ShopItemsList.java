package com.greenfoxacademy.springstart.model;

import java.util.ArrayList;
import java.util.List;

public class ShopItemsList {

    List<ShopItem> shopItemsList = new ArrayList<>();

    public ShopItemsList(){

        ShopItem item1 = new ShopItem("Running shoes", "For running", 1000, 5);
        ShopItem item2 = new ShopItem("Printer", "For printing", 500, 2);
        ShopItem item3 = new ShopItem("Coca-cola", "Always Coca-cola, 0.25l", 25, 0);
        ShopItem item4 = new ShopItem("T-shirt", "Cotton t-shirt", 300, 3);

        shopItemsList.add(item1);
        shopItemsList.add(item2);
        shopItemsList.add(item3);
        shopItemsList.add(item4);
    }

    public List<ShopItem> getShopItemsList() {
        return shopItemsList;
    }
}
