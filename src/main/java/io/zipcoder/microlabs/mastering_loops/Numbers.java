package io.zipcoder.microlabs.mastering_loops;


public class Numbers {



    public String oneToTen(){

        String result = "oneToTen()\n*** Output ***";

        for (int i = 1; i <= 10; i ++) {

            result = result + "\n" + i;
        }

        return result;

    }


    public String oddNumbers(){

        String result = "oddNumbers()\n*** Output ***";

        for (int i =1; i < 20; i++) {

            if (i % 2 != 0) {

                result = result + "\n" +i;
            }
        }

        return result;
    }



    public String squares(){

        String result = "squares()\n*** Output ***";

        for (int i = 1; i <= 10; i++) {

            result = result + "\n" + i*i;
        }
        return result;
    }


    public String random4(){

        String result = "random4()\n*** Output ***";

        for (int i = 0; i < 4; i++ ){

            result = result + "\n" + (int)(Math.random() * 10 + 1);
        }

        return result;
    }





    public String even(int n){


        String result = "even(" + n + ")\n*** Output ***";

        for (int i = 1; i < n; i++) {

            if (i % 2 == 0) {

                result = result + "\n" + i;
            }
        }

        return result;
    }

    public String powers(int n){

        String result = "powers(" + n + ")\n*** Output ***";

        for (int i = 1; i <= n; i++){

            result = result + "\n" + (int)Math.pow(2, i);
        }

        return result;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        System.out.println( num.random4() );

    }

}
