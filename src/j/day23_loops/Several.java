package j.day23_loops;

import java.util.Scanner;

public class Several {

         /*
            Given a String, find and print how many uppercase letter, lowercase
        letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4
        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
             */

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.println("Enter something: ");
            String word = input.nextLine().trim();
            int upperCase = 0;
            int lowerCase = 0;
            int num = 0;

            for (int i = 0; i < word.length(); i++){
                if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                    lowerCase++;
                } else if(word.charAt(i) >= 'A' && word.charAt(i) <='Z'){
                    upperCase++;
                } else if(word.charAt(i) >= '0' && word.charAt(i) <= '9'){
                    num++;
                }
            }

            System.out.println("\n---------RESULT---------");
            System.out.println(upperCase + " uppercase letters\n" + lowerCase + " lowercase letters\n" + num + " numbers");
        }

}
