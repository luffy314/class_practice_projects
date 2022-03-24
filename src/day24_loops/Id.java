package day24_loops;

import java.util.Scanner;

public class Id {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = input.nextLine().trim().toLowerCase();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine().trim();
        String res = "";

        res = "" + name.toLowerCase().charAt(0) + lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1, 4) + (name.length() * 2);

        System.out.println("\n----------RESULT----------");
        System.out.println("id: " + res);






    }

}
/*
Create ID [String]

Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2

	first name: john
	last name: smith

	id: jSmi8

------------------------------------------------------------------

[IQ] Prime number [Loops]

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11

	Output:
		prime


Ex:
	Input:
		10

	Output:
		not prime

------------------------------------------------------------------

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

------------------------------------------------------------------


 */