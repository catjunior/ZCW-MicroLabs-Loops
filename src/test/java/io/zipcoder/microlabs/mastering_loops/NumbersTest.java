package io.zipcoder.microlabs.mastering_loops;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class NumbersTest {


    Numbers numbers;
    @Before
    public void setUp(){ numbers = new Numbers(); }

    @Test
    public void oneToTenTest(){
        //: Given
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        assertEquals("The two strings are equal", expected, actual);
    }


    @Test
    public void oddNumbersTest(){
        //: Given
        String expected = "oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";

        //: When
        String actual = numbers.oddNumbers();

        //: Then
        assertEquals(expected, actual);
    }


    @Test
    public void squaresTest(){
        //: Given
        String expected = "squares()\n*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
        String actual = numbers.squares();

        //: Then
        assertEquals(expected, actual);
    }

    /*
    @Test
    public void random4Test(){
        //: Given

        //: When

        //: Then
    }
    */

    @Test
    public void evenTest(){
        //: Given
        String expected = "even(20)\n*** Output ***\n2\n4\n6\n8\n10\n12\n14\n16\n18";

        //: When
        String actual = numbers.even(20);

        //: Then
        assertEquals(expected, actual);
    }

    @Test
    public void powersTest(){
        //: Given
        String expected = "powers(6)\n*** Output ***\n2\n4\n8\n16\n32\n64";

        //: When
        String acutal = numbers.powers(6);

        //: Then
        assertEquals(expected, acutal);
    }

}
