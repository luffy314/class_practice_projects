package day24_loops;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine().trim();
        System.out.println("Enter number: ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            word += word.charAt(word.length() - 1);
        }

        System.out.println("\n---------RESULT---------");
        System.out.println(word);

    }
}
/*
Multiply End [String, Loops]

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa

------------------------------------------------------------------

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

------------------

 */