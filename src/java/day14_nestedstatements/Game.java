package java.day14_nestedstatements;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How much minutes is left? ");
        int minutes = input.nextInt();
        String result = "";

        if(minutes >= 0 && minutes <= 90){
            if(minutes <= 90 && minutes >= 75){
                result = "just getting started";
            } else if(minutes <= 74 && minutes >= 60){
                result = "players are doing their best";
            } else if(minutes <= 59 && minutes >= 30){
                result = "middle of the game is going great";
            } else{
                result = "the end of the game is approaching";
            }
        } else{
            if(minutes < 0){
                result = "minutes cannot be a negative number";
            } else{
                result ="games cannot be longer than 90 minutes";
            }
        }

        System.out.println("\n----------RESULT----------");
        System.out.println(result);
    }



}
//        ------------------------------------------------------------------------
//
//        declare and assign a minutes variable
//        use the minutes value to determine how much time is left in the soccer game
//
//        use these ranges to determine the outputs:
//
//        - any number less than 0 and more than 90 are not valid:
//
//        when the minutes is less than 0:
//        print: minutes cannot be a negative number
//        when the minutes is more than 90:
//        print: games cannot be longer than 90 minutes
//
//        - when the minutes are between 90 - 75
//        print: just getting started
//
//        - when the minutes are between 74 - 60
//        print: players are doing their best
//
//        - when the minutes are between 59 - 30
//        print: middle of the game is going great
//
//        - when the minutes are between 29 - 0
//        print: the end of the same is approaching
//
