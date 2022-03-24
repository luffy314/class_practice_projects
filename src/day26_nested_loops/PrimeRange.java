package day26_nested_loops;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = num > 0;
        String res = "";

        for (int i = 2; i <= num; i++) {
            isPrime = true;
            for(int j = 2; j < i; j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                res += i + ", ";
            }
        }

        System.out.println("\n--------RESULT--------");
        System.out.println(res.substring(0, res.lastIndexOf(',')));
    }
    }

    /*
      int range = 500;

        for(int i = 2; i <= range; i++){ // the purpose of this loop is to check all the numbers from 2 to the value the range variable

            int count = 0; // putting the counter inside the outer loop will reset it back to 0 for the next number

            for(int j = 2; j < i; j++){

                if(i % j == 0){
                    count++;
                }

            } // end of inner loop

            if(count == 0){
                System.out.print(i + ", ");
            }

        }
     */

/*
[IQ] Prime in range

Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		50
	Output:
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

------------------------------------------------------------

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