package com.company;
import java.util.Scanner;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        //1 Create menu items
        Menu menuItems = new Menu(new ArrayList<String>());
        menuItems.addItems("Hibachi");
        menuItems.addItems("Barbecue Burger");
        menuItems.addItems("Salad");


        //User prompts
        System.out.println("What item would you like to order?\n" + menuItems);
        System.out.println("For "  + menuItems.getMenuItems(0) + ", press 1. For " +  menuItems.getMenuItems(1) + ", press 2. For " + menuItems.getMenuItems(2) + ", press 3. After entering the number, hit enter.");

    }
}
