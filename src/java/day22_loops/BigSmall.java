package java.day22_loops;

import java.util.Scanner;

public class BigSmall {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 numbers to see the smallest and biggest");
        int largest = 0;
        int smallest = 0;
        int num = 5;
        int random;

        while(num>0) {

            System.out.println("enter number " + num);
            random = input.nextInt();
            if (random > largest) {
                largest = random;
            }else if (random < largest) {
                smallest = random;
            }

                num--;
            }

        System.out.println("the largest number is " + largest);
        System.out.println("the smallest number is " + smallest);


        }




}

/*
write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
 */