package j.day09_scanner;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = numbers.nextInt();
        System.out.println("num1 = " + num1);

        System.out.println("Enter second number");
        int num2 = numbers.nextInt();
        System.out.println("num2 = " + num2);

        System.out.println("are numbers equal");
        boolean numEqual = num1 ==num2;
        System.out.println("numEqual = " + numEqual);

        System.out.println(num1 == num2);  //different way to display it


    }
}
