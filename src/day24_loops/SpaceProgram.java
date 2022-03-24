package day24_loops;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter something: ");
        String str = input.nextLine().trim();
        str = str.replaceAll(" ", "_");

        for(int i = 0; i < str.length(); i++){

            System.out.print(str.charAt(i) + " ");
        }

    }
}
/*
   Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        String fixed = "";

        for(int i = 0; i < str.length(); i++){

            if (str.charAt(i) == ' ') {
                fixed += "_ ";
            } else {
                fixed += str.charAt(i) + " ";
            }

        }

        System.out.println(fixed.trim());
 */
/*

Space program [String, Loops]

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s

------------------------------------------------------------------

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