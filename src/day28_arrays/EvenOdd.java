package day28_arrays;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers u want?");
        int num = input.nextInt();

        int[] num2=new int[num];
        int even=0;
        int odd=0;

        for(int i=0; i<num;i++){
            System.out.println("enter ur numbers");
            num2[i]=input.nextInt();
            if (num2[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);


    }
}
/*
Even and odd from array
Write a program that can count the even and odd number from an array of
integers


        int[] nums = {4, 1, 3, 12, 5, 20, 13};
        int even = 0;
        int odd = 0;
        String evenNums = "";
        String oddNums = "";

//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] % 2 == 0) {
//                even++;
//                evenNums += nums[i] + " ";
//            } else {
//                odd++;
//                oddNums += nums[i] + " ";
//            }
//
//        }

        for(int number: nums){

            if(number % 2 == 0){
                even++;
                evenNums += number + " ";
            } else {
                odd++;
                oddNums += number + " ";
            }

        }

        System.out.println("Even counter: " + even);
        System.out.println("Even numbers: " + evenNums);

        System.out.println("Odd counter: " + odd);
        System.out.println("Odd numbers: " + oddNums);
 */
