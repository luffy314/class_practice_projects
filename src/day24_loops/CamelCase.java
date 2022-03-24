package day24_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = input.nextLine().trim().toLowerCase();

        String temp = "";
        String res = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            temp += str.charAt(i);

            if(str.charAt(i) == ' '){
                count++;
                if(count >= 2){
                    temp = temp.toUpperCase().charAt(0) + temp.substring(1);
                }
                res += temp;
                temp = "";
            }
        }

        temp = temp.toUpperCase().charAt(0) + temp.substring(1);
        res += temp;
        res = res.replaceAll(" ", "");

        System.out.println("\n---------RESULT---------");
        System.out.println(res);

    }
}
/*

Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday

 */