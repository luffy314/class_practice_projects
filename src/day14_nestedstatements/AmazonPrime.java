package day14_nestedstatements;

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 10;
        boolean hasPrime = false;
        String message;

        if(hasPrime){
            message = "eligible for 2 day shipping";

        }else {
            if (price>=25) {
                message = "eligible for regular free shipping";
            }else {
                message= "not eligible for free shipping, shipping fee 3.99";
            }

            System.out.println(message);

        }






    }
}
