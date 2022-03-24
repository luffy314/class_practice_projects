package day33_methods;

import java.util.Scanner;

public class CountNumbers {
    public static void showNumbers(int max){
        for(int i=0; i<=max;i++){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter max number");
        showNumbers(input.nextInt());
    }
}
