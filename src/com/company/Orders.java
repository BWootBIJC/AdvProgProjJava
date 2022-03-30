package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Orders extends Menu {
    Orders(ArrayList<String> items) {
        super(items);
    }

    public void PromptUserToOrder(Menu items) {
        //User prompts
        items.showMenu();
        for ( Menu item : items ) {
            System.out.println(item);
        }
        System.out.println("For "  + items.getMenuItems(0) + ", press 1. For " +  items.getMenuItems(1) + ", press 2. For " + items.getMenuItems(2) + ", press 3. After entering the number, hit enter.");
    }

    public ArrayList<String> CreateOrder () {
        ArrayList<String> myOrder = null;
        //Scanning for input
        int choice = 0;
        Scanner input = new Scanner(System.in);
        boolean isOrdering = true;
        while (isOrdering)
        {
            choice = input.nextInt();
            //Handle choices
            if (choice == 1) {
                String firstItem = menuItems.get(0);
                myOrder.add(firstItem);
                System.out.println(firstItem);
            }
            else if (choice == 2){
                System.out.println("Barbecue Burger not implemented exception");
            }
            else if (choice == 3){
                System.out.println("Salad not implemented exception");
            }
            else{
                System.out.println("Handle exception");
            }
            isOrdering = false;
        }
        return myOrder;
    }

    //TODO Implement Queuee that processes order
//    public Queue<String> ProcessOrder() {
//
//    }

}
