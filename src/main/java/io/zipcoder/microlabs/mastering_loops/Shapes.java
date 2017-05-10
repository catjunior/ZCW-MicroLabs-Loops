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

        for (int i = 1; i < 5; i++){

            for (int j = i; j <= i * 4; j=j+i) {


                if (j > 9) {

                    result = result + "| " + j + " "; // spacing for the lower right corner
                }

                else {

                    result = result + "| " + j + " "; //spacing for the rest of the square
                }

            }

            result = result + "|" + "\n"; // line brake and add | to the row end

        }

        return result;
    }

    /*
    public String tableSquares(int n){
        return "";
    }
    */
}
