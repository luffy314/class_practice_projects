package day39_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter ur paswords with aposthrephes and  commas");

        ArrayList<String> list=new ArrayList<>(Arrays.asList(input.nextLine(),input.nextLine()));
        System.out.println(list);
        System.out.println(hidePassword(list));

    }
    public static ArrayList<String> hidePassword(ArrayList<String> example){


        for(int i=0;i< example.size();i++) {

            String word = example.get(i);

            for (int j = 0; j < word.length(); j++) {
                word=word.replace(word.charAt(j), '*');

            }
            example.set(i,word);
        }return example;
    }
}
/*
Hide Password
Given an ArrayList of passwords (String). Hide each password in a star
(*) format where each character is a star and print the ArrayList of
hidden passwords
Ex:
Input:
{"one", "hi", "hold}
Output:
[ ***, **, **** ]
 */