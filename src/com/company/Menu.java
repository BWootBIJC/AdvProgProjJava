package com.company;

import java.util.ArrayList;

public class Menu {
    Menu(ArrayList<String> items) {
        items = menuItems;
    }

    public ArrayList<String> menuItems = new ArrayList<String>();

    public ArrayList<String> addItems(String items) {
        menuItems.add(items);
        return menuItems;
    }

    public String getMenuItems(int index) {
        return menuItems.get(index);
    }
}
