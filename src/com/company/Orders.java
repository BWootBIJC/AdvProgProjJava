package com.company;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Orders extends Menu {

    Queue<String> myOrder = new LinkedList<>();

    Orders(ArrayList<String> items) {
        super(items);
    }

    public String CreateOrder () {
        //Scanning for input
        int choice = 0;
        Scanner input = new Scanner(System.in);
        boolean isOrdering = true;
        while (isOrdering)
        {
            choice = input.nextInt();
            //Handle choices
            if (choice == 1) {

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
        return "";
    }

    public Queue<String> ProcessOrder() {

    }

}
