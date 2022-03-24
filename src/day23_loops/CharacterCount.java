package day23_loops;

import java.util.Scanner;

public class CharacterCount {
    /*
            Given a String find the biggest substring of chars that match and print
        it.
        Ex: aaabbbcccccddddee
        Output: ccccc
             */

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter something: ");
        String word = input.nextLine().trim().toLowerCase();
        String result = "";
        int count = 0;
        String max = "";

        for(int i = 0; i < word.length() - 1; i++){
            if(word.charAt(count) == word.charAt(i + 1)){
                result = word.substring(count, i + 2);
            } else{
                count += 1;
            }

            if(max.length() < result.length()){
                max = result;
            }
        }
    }
}
/*
String str = input.next();
        String result = "";
        String biggest = "";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                result = str.substring(count, i + 2);
            } else {
                if (result.length() > biggest.length()) {
                    biggest = result;
                    count += result.length();
                } else {
                    count += result.length();
                }
            }
        }
        System.out.println(biggest);
 */