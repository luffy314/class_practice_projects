package day09_scanner;
import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner addNumbers = new Scanner(System.in);

        System.out.println("first number");
        int num1 = addNumbers.nextInt();

        System.out.println("second number");
        int num2 = addNumbers.nextInt();

        System.out.println("third number");
        int num3 = addNumbers.nextInt();

        System.out.println("sum of three numbers: " + (num1 + num2 + num3));

    }
}
