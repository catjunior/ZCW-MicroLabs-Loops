package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;
import java.io.InputStream;



public class CarRide {



    Scanner user;

    // for unit test purples, use constructor to create a new "user", so the test can simulate the input
    CarRide(InputStream scannerIn) {

        user = new Scanner(scannerIn);
    }


    public String areWeThereYet(){

        String input;
        String finalOutPut;

        do {

            System.out.println("\"Are we there yet?\"");
            input = user.nextLine().toLowerCase();

        } while (!input.equals("yes"));

        System.out.println("Good!");
        finalOutPut = "Good!";

        return finalOutPut;
    }


    public static void main(String[] args) {

        CarRide newCustomer = new CarRide(System.in);
        newCustomer.areWeThereYet();
    }

}

