package j.day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("give me temperature");

        int temperature = input.nextInt();

        if (temperature>=70){
            System.out.println("it's ance day bitch, go outside");
        }else {
            System.out.println("it;s too cold, code more java");
        }

    }



}
