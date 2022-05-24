package java.day24_loops;

import java.util.Scanner;

public class ReverseSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence with 3 words: ");
        String str = input.nextLine().trim();

        String temp = "";
        String res = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            temp += str.charAt(i);

            if(str.charAt(i) == ' '){
                count++;
                if(count == 2)
                    for (int j = temp.length() - 2; j >= 0; j--) {
                        res += temp.charAt(j);
                    } else{
                    res += temp;
                }
                temp = "";
            }
        }
        res += " " + temp;

        System.out.println("\n---------RESULT---------");
        System.out.println(res);

    }
}
/*
Reverse only second word [String, Loops]

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java

------------------------------------------------------------------

Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday

 */