package java.day12_if_statements;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input 3 numbers to find the middle number");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();


        if (x >= y ){   //if statement can't take 3 different operands at once, u have to do two and then use & or | to add more inside parenthesis
            System.out.println(y);
        }else if (x>z){
            System.out.println(z);
        }else if (y>z){
            System.out.println(z);    //this method is too long, so i quit
        }else if (y>x){
            System.out.println(x);
        }else if (z>x){
            System.out.println(x);
        }else if (z>y){

        }
    }
}
