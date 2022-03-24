package day14_nestedstatements;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter How many minutes left in the game:");
        int minutes = scan.nextInt();
        String message;

        if (minutes >= 0 && minutes <= 90) {

            if (minutes >= 75 && minutes <= 90) {
                message = "just getting started";
            } else if (minutes >= 60 && minutes <= 74) {
                message = " players are doing their best";
            } else if (minutes >= 30 && minutes <= 59) {
                message = "middle of the game is going great";
            } else {
                message = "the end of the same is approaching";
            }

        } else {
            if (minutes < 0) {
                message = "minutes cannot be a negative number";
            } else {
                message = "games cannot be longer than 90 minutes";
            }
        }
        System.out.println(message);
    }
}
