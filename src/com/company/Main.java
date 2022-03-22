package com.company;
import java.util.Scanner;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //1 Create menu items
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("Hibachi");
        menuItems.add("Barbecue Burger");
        menuItems.add("Salad");

        //User prompts
        System.out.println("What item would you like to order?\n" + menuItems);
        System.out.println("For Sushi, press 1. For Barbecue Burger, press 2. For a Salad, press 3. After entering the number, hit enter.");

        //Scanning for input
        int choice = 0;
        Scanner input = new Scanner(System.in);
        boolean isOrdering = true;
        while (isOrdering) {
            choice = input.nextInt();
            //Handle choices
            if (choice == 1) {
                System.out.println("Hibachi not implemented exception.");
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
    }
}
