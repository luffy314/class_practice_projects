package java.day14_nestedstatements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your max budget?");
        int budget = input.nextInt();

        String name = "", range = "";
        double rating = 0;
        boolean gated = false, allowPets = false, isAvailable = true;

        if (budget > 0 && budget < 300_000) {

            System.out.println("Looking for houses");

            if (budget >= 55_000 && budget <= 75_000) {
                name = "Oaks";
                range = "55,000 - 75,000";
                rating = 3.5;
                gated = false;
                allowPets = true;
            } else if (budget >= 80_000 && budget <= 100_000) {
                name = "Hills";
                range = "80,000 - 100,000";
                rating = 4.0;
                gated = false;
                allowPets = true;
            } else if (budget >= 120_000 && budget <= 150_000) {
                name = "Highland";
                range = "120,000 - 150,000";
                rating = 4.5;
                gated = true;
                allowPets = false;
            } else if (budget >= 160_000 && budget <= 201_000) {
                name = "Canyon";
                range = "160,000 - 201,000";
                rating = 4.8;
                gated = true;
                allowPets = true;
            } else {
                System.out.println("No available houses");
                isAvailable = false;
            }

            if(isAvailable) {

                String ad = "Name of the neighborhood: " + name + "\nPrice range: " + range + "\nRating: " + rating;
                ad += "\nGated: " + (gated ? "Yes" : "No"); // this means if the gated boolean is true, it will concatenate "yes" into the ad, but if the gated boolean is false it will concatenate "no" into the ad
                ad += "\n" + (allowPets ? "They allow pets" : "They don't allow pets");

                System.out.println(ad);
            }

        } else {

            if (budget <= 0) {
                System.out.println("Your budget cannot be less than or equal to 0");
            } else {
                System.out.println("Too much money for this agency");
            }

        }





    }
}
