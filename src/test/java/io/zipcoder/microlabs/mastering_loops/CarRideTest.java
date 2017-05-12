package io.zipcoder.microlabs.mastering_loops;


import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;

public class CarRideTest {


    @Test
    public void areWeThereYetTest(){

        //Given:
        String input = "No\nSpoons\nYes\n";  // simulate the userInput
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        CarRide carRide = new CarRide(byteArrayInputStream);

        String expected = "Good!";

        // when
        String actual = carRide.areWeThereYet();

        // then
        assertEquals(expected, actual);
    }

}

