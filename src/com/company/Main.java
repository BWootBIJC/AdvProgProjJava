package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        //1 Create menu items
        Menu menuItems = new Menu(new ArrayList<String>());
        menuItems.addItems("Hibachi");
        menuItems.addItems("Barbecue Burger");
        menuItems.addItems("Salad");
        menuItems.addItems("Drinks");


        //Start Order
        Orders myOrder = new Orders(new ArrayList<String>());
        myOrder.PromptUserToOrder(menuItems);
        myOrder.CreateOrder();
    }
}
