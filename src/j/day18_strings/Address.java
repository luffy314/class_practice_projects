package j.day18_strings;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address: ");
        String address = input.nextLine().trim().toUpperCase();
        boolean isDrive = address.contains(" DRIVE");
        boolean isLane = address.contains(" LANE");
        boolean isAvenue = address.contains(" AVE") || address.contains(" AVENUE");
        boolean isRightSide = address.startsWith("500");
        boolean isLeftSide = address.startsWith("600");
        String result = "";

        if (isDrive && isLeftSide) {
            result = address + "\nhouse on the left side\nhouse on drive";
        } else if (isDrive && isRightSide) {
            result = address + "\nhouse on the right side\nhouse on drive";
        } else if (isAvenue && isLeftSide) {
            result = address + "\nhouse on the left side\nhouse on avenue";
        } else if (isAvenue && isRightSide) {
            result = address + "\nhouse on the right side\nhouse on avenue";
        } else if (isLane && isLeftSide) {
            result = address + "\nhouse on the left side\nhouse on lane";
        } else if (isLane && isRightSide) {
            result = address + "\nhouse on the right side\nhouse on lane";
        } else if (isAvenue) {
            result = address + "\nhouse on avenue";
        } else if (isDrive) {
            result = address + "\nhouse on drive";
        } else if (isLane) {
            result = address + "\nhouse on lane";
        } else {
            result = address;
        }

        System.out.println("\n---------RESULT----------");
        System.out.println(result);

    }
}
//        create a class Address
//ask the user to enter their address as one input
//        check which street the house is on and which side of street
//        handle any extra spaces in the beginning or end of input address
//        at the end also print the address as all uppercase letters
//
//        houses that have a house number starting with the numbers 500 are on the right side of the street while the address that start with the number 600 are on the left side of the street
//
//        the street they are on is given in the address
//
//        print the street by checking for these streets:
//
//        drive: house on drive
//
//        lane: house on lane
//
//        ave: house on avenue
//
//        Ex:
//
//        Input:
//        500312 road w drive, 98404
//
//        Output:
//        500312 ROAD W DRIVE, 98404
//        house on the right side
//        house on drive
//
//        Ex:
//
//        Input:
//        600134 South lane, 500415
//
//        Output:
//        600134 SOUTH LANE, 500415
//        house on the right side
//        house on drive
//
//        -----------------------------------------------------------------
//
//        create a class AccountNumber
//ask the user enter an account number and check if the account number is valid. Accounts are valid if:
//        handle empty inputs. If there is an empty input, do not check anything else and print: "Empty input given"
//
//        - If the account number begins with a "2" the account number should be 7 characters long
//        Print: "Valid 7-digit account number"
//        Otherwise: "Invalid 7-digit account number"
//
//        - If the account number begins with a "5" the account number should be 10 characters long
//        Print: "Valid 5-digit account number"
//        Otherwise: "Invalid 5-digit account number"
//
//        — If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”
//
//        -----------------------------------------------------------------
//
