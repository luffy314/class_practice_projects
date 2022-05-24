package java.day11_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("are u hungry? true or false");
        boolean isHungry = input.nextBoolean();


        if (isHungry) {
            System.out.println("you are hungry so i will get food for u");
        } else {
            System.out.println("great then practice java");
        }


    }
}
