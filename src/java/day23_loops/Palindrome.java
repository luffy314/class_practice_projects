package java.day23_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine().trim().toLowerCase();
        String reserve = "";

        for (int i = word.length() - 1; i >= 0; i--){
            reserve += word.charAt(i);
        }

        System.out.println("\n---------Result-----------");

        if(reserve.equals(word)){
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
        System.out.println(reserve.equals(word) ? "Palindrome" : "Not Palindrome");

    }
}
