package com.company;

import java.util.*;

public class Orders extends Menu {
    Orders(ArrayList<String> items) {
        super(items);
    }

    public void PromptUserToOrder(Menu items) {
        items.ShowMenu();
    }

    public ArrayList<String> CreateOrder() {
        ArrayList<String> myOrder = new ArrayList<String>();

        //Scanning for input
        int choice = 0;
        Scanner input = new Scanner(System.in);
        boolean isOrdering = true;
        while (isOrdering) {
            choice = input.nextInt();
            //Handle choices
            if (choice == 0) {
                myOrder.add("Pizza");
                System.out.println("Anything else? Press 4 to finish.");
            } else if (choice == 1) {
                myOrder.add("Burger");
                System.out.println("Anything else? Press 4 to finish.");
            } else if (choice == 2) {
                myOrder.add("Salad");
                System.out.println("Anything else? Press 4 to finish.");
            } else if (choice == 3) {
                myOrder.add("Drinks");
                System.out.println("Anything else? Press 4 to finish.");
            } else{
                isOrdering = false;
                System.out.println("Order is being placed in the oven!");
            }
        }

        ProcessOrder(myOrder);
        System.out.println(myOrder);
        return myOrder;
    }

    public void ProcessOrder(ArrayList<String> myOrder) {
        //Initialize waiting queue
        Queue<ArrayList<String>> queue = new LinkedList<>();

        //Add order to queue
        queue.add(myOrder);

        //Create timer for food prep
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Order is ready!");
                queue.remove();
            }
        }, 5000L); // 300 is the delay in millis
    }

}
