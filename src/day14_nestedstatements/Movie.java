package day14_nestedstatements;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the movie? (hh.mm) ");
        double lengthOfTheMovie = input.nextDouble();
        String result ="" ;


        if(lengthOfTheMovie > 0 && lengthOfTheMovie <= 4){
            if(lengthOfTheMovie <= 1 ){
                result = "$8.99";
            } else if (lengthOfTheMovie > 1 && lengthOfTheMovie <= 1.5){
                result = "$10.50";
            } else if(lengthOfTheMovie > 1.5 && lengthOfTheMovie <= 2.0){
                result = "$12.99";
            } else if(lengthOfTheMovie > 2.0 && lengthOfTheMovie <= 2.5){
                result = "$14.50";
            } else if(lengthOfTheMovie > 2.5) {
                result = "$15.99";
            }
        } else{
            if(lengthOfTheMovie > 4){
                result = "Movies cannot be more than 4 hours";
            } else{
                result = "Movies cannot be less than 0 minutes";
            }
        }

        System.out.println("\n---------RESULT---------");
        System.out.println("Price for the ticket: " + result);
    }
}

//        ------------------------------------------------------------------------
//
//        The length of the movie will determine how much it costs.
//        declare and assign a variable for the duration of the movie
//        The length will be given as a decimal as hours.minutes
//
//        duration of less than or equal to 0:
//        Movies cannot be less than 0 minutes
//        duration of more than 4:
//        Movies cannot be more than 4 hours
//
//        for all other duration uses the following values to display the price of the tickets
//
//        duration 	--> price
//        1.0 		--> 8.99
//        1.5 		--> 10.50
//        2.0 		--> 12.99
//        2.5 		--> 14.50
//        3, 3.5 or 4 --> 15.99
//
