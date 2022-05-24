package java.day24_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number for factorial");
        int num = input.nextInt();
        int result = 1;

        for(int i=1;i<=num;i++){


            result *=i;


            System.out.println(result);

        }

    }
}
