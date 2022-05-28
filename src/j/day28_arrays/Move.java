package j.day28_arrays;

import java.util.Arrays;

public class Move {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("how many numbers");
//        int num = input.nextInt();
//
//        int[] num2 = new int[num];
//        int[] num3 = new int[num];
//
//        for (int i = 0; i < num; i++) {
//
//        }
        int [] arr = {10, 0, 5, 0, 1, 0};
        int [] res = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                res[count] = arr[i];
                count++;
            }
        }

        System.out.println("\n--------RESULT---------");
        System.out.println(Arrays.toString(res));
    }
}
/*
Move Zeros
Write a program that will move all the zero numbers to the end of the array.
The rest of the numbers will move over in position
 */