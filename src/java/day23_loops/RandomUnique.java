package java.day23_loops;

import java.util.Random;

public class RandomUnique {
     /*
            Generate a random number that is six digits long. Each digit in this
        number should be unique, meaning the number 6 digit number should
        have 6 different character numbers that make it up. Print the number.
        HINTS: Loops, Strings, Random class in java
             */

    public static void main(String[] args){

        Random rn = new Random();
        int range = 9;
        int randomNum;
        String temp = "";
        String res = "";

        do {
            randomNum = rn.nextInt(range);
            temp = "" + randomNum;

            if (!res.contains(temp.charAt(0) + "")) {
                res += randomNum;
            }
        } while (res.length() < 6);

        System.out.println("\n--------RESULT--------");
        System.out.println(res);
    }
}

/*
  Random random = new Random();

        String number = "";
        int count = 0;

        while (count < 6) {

            String num = "" + random.nextInt(10);

            if (!number.contains(num)) {

                number += num;
                count++;

            }
        }

        System.out.println("number = " + number);
 */