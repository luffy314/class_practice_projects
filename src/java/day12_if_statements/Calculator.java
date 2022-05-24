package java.day12_if_statements;

public class Calculator {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 7;
        char operator = '+';



        if (operator == '+') {
            System.out.println(num1 + num2);
        }else{
            System.out.println("invalid operator");
        }
    }
}

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
