package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers");
        int num = input.nextInt();

        int[] num2 = new int[num];
        int[] num3 = new int[num];
        int j=0;

        for(int i=0; i<num;i++){
            System.out.println("enter numbers to reverse them");
            num2[i]= input.nextInt();

        }
        System.out.println(Arrays.toString(num2));

        for(int i=num-1; i>=0;i--,j++) {
            num3[j]= num2[i];
        }
        System.out.println(Arrays.toString(num3));
/*
 int [] arr = {1, 2, 3, 4, 5};
        int [] reverse = new int[arr.length];

//        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
//            reverse[j] = arr[i];
//        }

        for(int i = 0; i < arr.length; i++){
            reverse[arr.length - 1 - i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));
 */





    }
}
/*
Reverse Array
Write a program that will reverse the order of any given array
 */