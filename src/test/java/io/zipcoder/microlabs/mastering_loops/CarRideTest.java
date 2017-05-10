package io.zipcoder.microlabs.mastering_loops;


import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;

public class CarRideTest {


    @Test
    public void areWeThereYetTest(){
        //Given:
        String input;
        String expected = "\"Are we there yet?\"\n + No\n\"Are we there yet?\"\nSoon\n\"Are we there yet?\"\nYes\nGood!";

        //When:
        Scanner userInput = new Scanner(System.in);
        input = userInput.nextLine().toLowerCase();


        CarRide newCustomer = new CarRide ();
        String actual = newCustomer.areWeThereYet();

        //Then:
        assertEquals(expected, actual, 0);
    }

}

