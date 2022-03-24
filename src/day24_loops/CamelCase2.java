package day24_loops;

import java.util.Scanner;

public class CamelCase2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = input.nextLine().toLowerCase();
        String camelCase = str.substring(0, 1); // I'm putting the first character into the String right away, because my loop will start from i = 1. It starts from i = 1 because I am doing i - 1 to check for spaces and I don't want to do this in the first iteration

        for(int i = 1; i < str.length(); i++){

            if(str.charAt(i - 1) == ' '){
                camelCase += str.substring(i , i + 1).toUpperCase(); //("" + str.charAt(i)).toUpperCase(). sub(i , i + 1) is the same as charAt(i) but the types are different

            } else {
                camelCase += str.charAt(i); //today
            }

        }

        System.out.println(camelCase.replace(" ", "")); // delete the spaces
    }
}
