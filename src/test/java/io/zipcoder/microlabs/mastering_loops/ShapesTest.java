package io.zipcoder.microlabs.mastering_loops;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ShapesTest {

    Shapes shape;
    @Before
    public void setUp(){ shape = new Shapes(); }


    @Test
    public void triangleTest(){
        //: Given
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";

        //: When
        String actual = shape.triangle();

        //: Then
        assertEquals( expected, actual);
    }


    @Test
    public void tableSquareTest(){
        //: Given
        String expected = "A 4 x 4 table square\n*** Output ***\n" +
                            "| 1 |  2 |  3 |  4 |\n" +
                            "| 2 |  4 |  6 |  8 |\n" +
                            "| 3 |  6 |  9 | 12 |\n" +
                            "| 4 |  8 | 12 | 16 |";

        //: When
        String actual = shape.tableSquare();

        //: Then
        assertEquals( expected, actual);
    }


    @Test
    public void tableSquaresTest(){
        //: Given
        String expected = "tableSquares(6)\n*** Output ***\n" +
                            "| 1 |  2 |  3 |  4 |  5 |  6 |\n" +
                            "| 2 |  4 |  6 |  8 | 10 | 12 |\n" +
                            "| 3 |  6 |  9 | 12 | 15 | 18 |\n" +
                            "| 4 |  8 | 12 | 16 | 20 | 24 |\n" +
                            "| 5 | 10 | 15 | 20 | 25 | 30 |\n" +
                            "| 6 | 12 | 18 | 24 | 30 | 36 |";

        //: When
        String actual = shape.tableSquares(6);

        //: Then
        assertEquals( expected, actual);

    }

}
