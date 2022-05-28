package j.day12_if_statements;

import java.util.Scanner;

public class ClassRetake {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.print("Enter your grade: ");
            double grade = input.nextDouble();
            System.out.print("How many times do you attempt? ");
            int retake = input.nextInt();
            retake -= 1;
            String result = "Your final grade is: ";

            System.out.println("\n----------RESULT----------");

            if(retake == 0){
                System.out.println(result + grade);
            } else if(retake == 1){
                System.out.println(result + grade * 0.9);
            } else if(retake == 2){
                System.out.println(result + grade * 0.8);
            } else if(retake == 3){
                System.out.println(result + grade * 0.65);
            } else{
                System.out.println("Error");
            }
        }
        }



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
