package day18_strings;

import java.util.Scanner;

public class UserAndPass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter username");
        String username = input.next();
        System.out.println("enter password");
        String password = input.next();

        boolean isValid = password.length() >= 5;
        boolean isValid2 = password.contains(username);

        if(isValid) {
            if (!isValid2) {
                System.out.println("valid password");
            } else {
                System.out.println("invalid password, username should not be in it");
            }


        }else {
            System.out.println("password cannot be less than 5 characters");
        }



    }
}



/*
String Method Practice
-----------------------------------------------------------------
create a class UserAndPass
ask the user to enter a username and password. Check if they are valid based on the following requirements:

- The password cannot be less than 5 characters
	If it is less print: "Password cannot be less than 5 characters"
	If it is more than or equal to 5 print: "Valid password"

- Also, the password should not contain the username
	If the password has the username in it print: "Invalid password, username should not be in it" and in that case change the password to have the value: "password"

Print the information in the end

-----------------------------------------------------------------

create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.

-----------------------------------------------------------------

create a class Title
ask the user to enter their name including titles
use the following titles to determine how to refer to the person as

handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:

		Mr or Mister
		Ms or Miss or Madam
		Dr

	and some titles can come after a name:

		Sr
		Jr

Based on both starting and ending titles print the following messages:

		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

Note: It is possible to have both beginning and ending titles, one of them, or none of them

-----------------------------------------------------------------

create a class Address
ask the user to enter their address as one input
check which street the house is on and which side of street
handle any extra spaces in the beginning or end of input address
at the end also print the address as all uppercase letters

	houses that have a house number starting with the numbers 500 are on the right side of the street while the address that start with the number 600 are on the left side of the street

	the street they are on is given in the address

		print the street by checking for these streets:

			drive: house on drive

			lane: house on lane

			ave: house on avenue

	Ex:

		Input:
			500312 road w drive, 98404

		Output:
			500312 ROAD W DRIVE, 98404
			house on the right side
			house on drive

	Ex:

		Input:
			600134 South lane, 500415

		Output:
			600134 SOUTH LANE, 500415
			house on the right side
			house on drive

-----------------------------------------------------------------

create a class AccountNumber
ask the user enter an account number and check if the account number is valid. Accounts are valid if:
handle empty inputs. If there is an empty input, do not check anything else and print: "Empty input given"

	- If the account number begins with a "2" the account number should be 7 characters long
		Print: "Valid 7-digit account number"
		Otherwise: "Invalid 7-digit account number"

	- If the account number begins with a "5" the account number should be 10 characters long
		Print: "Valid 5-digit account number"
		Otherwise: "Invalid 5-digit account number"

	— If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”

-----------------------------------------------------------------

 */