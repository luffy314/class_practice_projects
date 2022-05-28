package j.day23_loops;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine().toLowerCase();
        System.out.println("enter a character: ");
        char check = input.nextLine().toLowerCase().charAt(0);
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == check){
                count++;
            }
        }

        System.out.println("\n--------RESULT---------");
        System.out.println(count);







    }
}
