package java.day09_scanner;
import java.util.Scanner;
public class OrPractice {
    public static void main(String[] args) {



    Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name:");
    String productName = input.nextLine();
        System.out.println("Enter the price: $");
    double price = input.nextDouble();
        System.out.println("Enter the quantity:");
    int quantity = input.nextInt();
        System.out.println("Enter your first name:");
    String firstName = input.nextLine();
    double totalCost = price * quantity;

    String result = firstName + ", your order for " + quantity + " " +  productName + " has been placed.\nYour total is $" + totalCost;

        System.out.println("\n----------RESULT---------");
        System.out.println(result);


//
//        Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
//
//                ---------------------------------------------------------------------------
//
//                Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
//        Determine if the angles make a triangle, which means the angles add to 180.0
//        and
//        Determine if the angles make a circle, which means the angles add to 360.0
//
//                ---------------------------------------------------------------------------
//
//                Ask the user to enter their age (byte),
//        ask them to enter their favorite number (long),
//        and ask them to enter their favorite book
//        Print all the values from the inputs
//
//                ---------------------------------------------------------------------------
//
//                Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values
//
//        Ex:
//        Enter a number
//        65
//
//        65 is divisible by 2: false
//        65 is divisible by 3: false
//        65 is divisible by 5: true
//                ---------------------------------------------------------------------------
//
//                create a class LeapYear
//create a main method
//        create a Scanner object
//
//        Ask the user to enter a year. Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4. Print true or false.
//
//                Hint: use remainder operator
//                ---------------------------------------------------------------------------
//
//                Ask the user to enter an int number. Determine if the number is even or odd
//        Print a boolean for both even and odd
//
//        ---------------------------------------------------------------------------
//
//                write a program for a rate calculator: RateCalculator
//        1. asks the user to enter a salary (double)
//        2. asks the user how many hours he/she works in a week (as int)
//        3. print the hourly rate (double) of the employee
//        assume that one year has 52 weeks
//        hourly rate = salary / (hours weekly * 52)
//
//        ---------------------------------------------------------------------------
//
//                Challenge for today: Try it yourself and see otherwise we will go through it together.
//
//        - Place an order
//        - Ask the user the enter the product name (String, multiple words)
//                - Ask the user to enter the price (double)
//                - Ask the user to enter the quantity(int)
//                - Ask the user to enter their full name (String, multiple word)
//                - Print in the following format:
//        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
//        Ex:
//        Input: "Apples" , 1.5, 5. "Luke"
//        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
//
//                ============================================================
//
//



    }
}
