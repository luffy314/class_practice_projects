package day23_loops;

import java.util.Scanner;

public class CharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = input.nextLine().trim();
        String num="";
        int letter;

        for(int i=0; i<sentence.length();i++){
            letter = sentence.charAt(i);
            num+=letter + " ";
        }
        System.out.println(num);
    }
}
/*
Characters in String
Given a String print the ascii value codes for each character
Ex:
Input:
“java”
Output:
106 97 118 97


String s = "java";

        for(int i = 0; i  < s.length(); i++){

            System.out.print((int)s.charAt(i) + " ");

            // int value = s.charAt(i);

 */