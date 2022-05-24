package java.day11_if_statements;

import java.util.Scanner;

public class New {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter only one letter: ");
        String getLetter = input.next();

        char letter =  getLetter.charAt(0);

        System.out.println("\n----------RESULT---------");

        if(letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is uppercase");
        } else if(letter >= 'a' && letter <= 'z'){
            System.out.println(letter + " is lowercase");
        }
    }
}