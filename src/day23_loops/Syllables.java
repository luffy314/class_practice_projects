package day23_loops;

import java.util.Scanner;

public class Syllables {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter sentence with dashes to separate syllables");
        String sentence = input.nextLine().trim();
        int count=1;

        for(int i=0; i<sentence.length()-1;i++){
            if(sentence.charAt(i)=='-'){
                count++;

            }
        }
        System.out.println(count);


    }
}
/*
Syllables
Given a String separated by dashes calculate how many syllables the
words are
Ex:
Input:
ja-va
Output:
2
 */