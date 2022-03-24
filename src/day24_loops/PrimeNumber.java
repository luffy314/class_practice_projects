package day24_loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter whole number: (1 - 999) ");
        int num = input.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("\n---------RESULT----------");
        System.out.println(isPrime ? "prime" : "not prime");

    }
}
/*

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

------------------
 */