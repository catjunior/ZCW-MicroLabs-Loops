package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;


public class CarRide {

    Scanner userInput = new Scanner(System.in);


    public String areWeThereYet(){

        String input;
        String finalOutPut;

        do {

            System.out.println("\"Are we there yet?\"");
            input = userInput.nextLine().toLowerCase();

        } while (!input.equals("yes"));

        System.out.println("Good!");
        finalOutPut = "Good!";

        return finalOutPut;
    }

    public static void main(String[] args) {

        CarRide newCustomer = new CarRide();
        newCustomer.areWeThereYet();
    }

}

