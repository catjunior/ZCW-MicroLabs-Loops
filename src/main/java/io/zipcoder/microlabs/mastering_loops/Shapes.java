package io.zipcoder.microlabs.mastering_loops;


public class Shapes {


    public String triangle() {

        String result = "triangle()\n*** Output ***\n";

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {

                result = result + "*";
            }

            if (i ==4 ){break;} //prevents print an extra line at the end

            result = result + "\n";
        }

        return result;
    }


    public String tableSquare(){

        String result = "A 4 x 4 table square\n*** Output ***\n";

        outerloop: // for rows
        for (int i = 1; i < 5; i++){

            innerloop: // for columns
            for (int j = i; j < i * 5; j = j+i) {

                if (j >= i * 2 && j < 10) {         // spacing for column 2 and beyond, and the value is < 10

                     result = result + "|  " + j + " ";

                } else if (j > 9 && j < 16) {

                    result = result + "| " + j + " "; // spacing for column 3 and beyond, but value >= 10

                } else if (j == 16) {                 // avoid extra line break at the end

                    result = result + "| " + j + " |";
                    break outerloop;

                } else {

                    result = result + "| " + j + " "; //spacing for the rest of the square
                }

            }

            result = result + "|" + "\n"; // this is where innerloop(row) ends

        }

        return result;
    }



    public String tableSquares(int n){

        String result = "tableSquares(" + n + ")\n*** Output ***\n";

        outerloop: // for rows
        for (int i = 1; i <= n; i++){

            innerloop: // for columns
            for (int j = i; j <= i * n; j = j+i) {

                if (j >= i * 2 && j < 10) {         // spacing for column 2 and beyond, and the value is < 10

                    result = result + "|  " + j + " ";

                } else if (j > 9 && j < n * n) {

                    result = result + "| " + j + " "; // spacing for column 3 and beyond, but value >= 10

                } else if (j == n * n) {                 // avoid extra line break at the end

                    result = result + "| " + j + " |";
                    break outerloop;

                } else {

                    result = result + "| " + j + " "; //spacing for the rest of the square
                }

            }

            result = result + "|" + "\n"; // this is where innerloop(row) ends

        }

        return result;
    }

}
