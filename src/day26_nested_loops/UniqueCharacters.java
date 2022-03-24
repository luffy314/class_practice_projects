package day26_nested_loops;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a string of characters to find the unique ones");
        String word = input.nextLine();

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count = 0;
            char letter = word.charAt(i);

            for (int j = 0; j < word.length(); j++) {
                char letter2 = word.charAt(j);

                if (letter == letter2) {
                    count++;

                }
            }

        if (count == 1) {
            System.out.print(letter + "");
        }

    }}
}
/*

[IQ] Unique characters

Given a String, find and print the unique characters. A character is unique if it only appears once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		BDF

	-> the characters B D and F are only found in the String once so they are unique

------------------------------------------------------------

[IQ] Duplicate characters

Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		ACE

	-> the characters A C and E are found in the String multiple times so they are duplicates

 */
