package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        //1 Create menu items
        Menu menuItems = new Menu(new ArrayList<>());
        menuItems.AddItems(0, "Pizza");
        menuItems.AddItems(1, "Burger");
        menuItems.AddItems(2, "Salad");
        menuItems.AddItems(3, "Drinks");


        //Start Order
        Orders myOrder = new Orders(new ArrayList<String>());
        myOrder.PromptUserToOrder(menuItems);
        myOrder.CreateOrder();
    }
}
