package java.day23_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = input.nextLine().trim();

        int count = 1;

        for(int i =0; i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);

    }
}
/*
Count Words
Given a sentence determine how many words are in the String.
Ex:
Input:
This has multiple words
Output:
4
 */