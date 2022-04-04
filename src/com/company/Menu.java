package com.company;

import java.util.ArrayList;

public class Menu {
    Menu(ArrayList<String> items) {
        items = menuItems;
    }

    public ArrayList<String> menuItems = new ArrayList<String>();

    public void ShowMenu() {
        System.out.println("What items would you like to order?\n" + menuItems);
        for (int i = 0; i <= menuItems.size(); i++){
            if(i <= menuItems.size() - 1) {
                System.out.println("For " + menuItems.get(i) + ", press " + i);
            }
            else{
                System.out.println("To finish ordering, press " + i);
            }

        }

    }

    public ArrayList<String> AddItems(int index, String items) {
        menuItems.add(index, items);
        return menuItems;
    }

    public String GetMenuItems(int index) {
        return menuItems.get(index);
    }
}
