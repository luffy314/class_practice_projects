package day12_if_statements;

import java.util.Scanner;

public class ClassDiver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("oxygen tank level");
        int oxygenTank = input.nextInt();

        if (oxygenTank>90){
            System.out.println("your tank is full");
        }else if (oxygenTank>80) {
            System.out.println("still okay");
        }else if (oxygenTank>70) {
            System.out.println("don't go too far");
        }else if (oxygenTank>60) {
            System.out.println("start to head back");
        }else if (oxygenTank>50) {
            System.out.println("be careful");
        } else {
            System.out.println("u dead");
        }





//        -----------------------------------------------------------
//
//                create a class Diver
//
//You are diving in the ocean. Your oxygen tank has a certain level (number)
//
//        declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:
//
//        Above 90 - Your tank is full
//        Above 80 - Still okay
//        Above 70 - Don't go too far
//        Above 60 - Start to head back
//        Above 50 - Be careful now you at at 50%
//
//                -----------------------------------------------------------
//
//                        create a class ChooseLanguage
//
//ask the user to enter a number based on the language they wanted to use.
//        1 - English
//        2 - Spanish
//        3 - Turkish
//        4 - Russian
//        5 - French
//
//        based on the number they picked print a message:
//
//        1 : "hello, thank for your call"
//        2 : "hola, gracias para llamar"
//        3 : "merhaba, aradiginiz icin tesekkurler"
//        4 : "privet, spasibo za vash zvonok"
//        5 : "Merci ,pour votre appel"
//        any other number: "We will use English by default"
//
//                -----------------------------------------------------------
//
//                create a class Calculator
//
//        - do it without Scanner
//
//        declare and assign 2 number variables
//        declare and assign a char variable for an operator
//
//        create a calculator based on the operator picked
//        + : add num1 and num2
//        - : minus num1 and num2
//	* : multiply num1 and num2
//	/ : divide num1 and num2
//        any other char: "invalid operator"
//
//                -----------------------------------------------------------
//
//                create a class Retake
//
//declare and assign a grade variable
//        declare and assign an attempt number
//
//        Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
//
//        If its the first attempt -> subtract 10%
//                If its the second attempt -> subtract 20%
//                If its the third attempt -> subtract 35%
//
//                Based on the retake attempt number calculate the final grade




    }
}
