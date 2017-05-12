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

                } else {

                    result = result + "| " + j + " "; //spacing for the rest of the square
                }

            }

            result = result + "|" + "\n"; // this is where innerloop(row) ends

        }

        return result.trim();
    }



    public String tableSquares(int n){

        String result = "tableSquares(" + n + ")\n*** Output ***\n";

        int maxLength = (int) Math.log10(n*n) + 1;

        rows:
        for (int i = 1; i <= n; i++){

            columns:
            for (int j = i; j <= i * n; j += i) {

                String spaces = "";
                int jLength = Integer.toString(j).length();

                spaceAdder:
                for (int k = 0; k < (maxLength - jLength ); k++){ // for the space before each digits
                    spaces += " ";
                }

                result += "|" + spaces + j + " ";

            }

            result += "|" + "\n"; // this is where innerloop(row) ends

        }

        return result.trim();
    }



    public static void main(String[] args) {
        Shapes shape = new Shapes();
        System.out.println( shape.tableSquares(100).trim());
    }

}

