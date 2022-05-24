package java.day12_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("choose a number between 1-7 for which language u want");
        int language = input.nextInt();

        if (language==1){
            System.out.println("hello, thank for the call");
        }else if (language==2){
            System.out.println("hola, gracia par illamer");
        }else {
            System.out.println("merhaba, aradigininz");
        }
    }
}

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
