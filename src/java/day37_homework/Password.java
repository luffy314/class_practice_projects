package java.day37_homework;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = input.nextLine();
        String specCharacter = "!@#$%^&*";
        char[] appart = specCharacter.toCharArray();

        int countUC = 0;
        int countLC = 0;
        int countN = 0;
        int specChar = 0;
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    countUC++;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    countLC++;
                } else if (Character.isDigit(password.charAt(i))) {
                    countN++;
                }
                char[] a = password.toCharArray();
                for (int j = 0; j < password.length(); j++) {
                    for (char each : appart) {
                        if (each == a[j]) {
                            specChar++;
                        }
                    }
                }
            }

            if (countLC >= 1 && countN >= 1 && countUC >= 1 && specChar >= 1) {
                System.out.println("Your password is valid");
            }
            if (countLC < 1) {
                System.out.println("Add lower case character in the password");
            }
            if (countUC < 1) {
                System.out.println("Add upper case character in the password");
            }
            if (countN < 1) {
                System.out.println("Add number in the password");
            }
            if (specChar < 1) {
                System.out.println("Add special character in the password");
            }
            } else {
            System.out.println("your password must have at least 8 characters");
        }
    }

    }

/*

Valid Password

	Given a String password find out if it is a valid password

	Requirements:

		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number
		Must have one of the follow special characters:
			! @ # $ % ^ & *

 */

/*
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        System.out.println(isPasswordValid(input.nextLine()));
    }

    public static boolean isPasswordValid(String str){

        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;
        int specialChar = 0;

        if(str.length() >= 8) {
            for (int i = 0; i < str.length(); i++) {
                if(Character.isUpperCase(str.charAt(i))){
                    upperCase++;
                } else if(Character.isLowerCase(str.charAt(i))){
                    lowerCase++;
                } else if(Character.isDigit(str.charAt(i))){
                    number++;
                } else if(str.charAt(i) == '!' || str.charAt(i) == '@' || str.charAt(i) == '#' || str.charAt(i) == '$'
                        || str.charAt(i) == '%' || str.charAt(i) == '^' || str.charAt(i) == '&' || str.charAt(i) == '*'){
                    specialChar ++;
                }
            }
        }

        return upperCase >= 1 && lowerCase >= 1 && number >= 1 && specialChar >= 1;
    }
 */