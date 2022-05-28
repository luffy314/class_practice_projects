package j.day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declare multidimensional array and use user input to define how many array elements are in it -> the first [] will define how many arrays the multidimensional array has -> the second [] defines the length, we will leave it empty so we can add arrays that may be different in size
        System.out.println("enter how many rows in array");
        int[][] num = new int[input.nextInt()][];

        //outer loop will start the assignments of the arrays stored in the 2D array with the array located at index 0
        for (int i = 0; i < num.length; i++) {
            //ask user how many elements are in array -> first element in multidimensional array named num is an array, and we need to define how many numbers are in it
            System.out.println("how many elements in first array");
            //declare an array, take user input and use it to define the length of the array -> how many numbers are in the array we want to add to multidimensional array
            int[] x = new int[input.nextInt()];
            //inner loop will assign numbers to the array x we created
            for (int j = 0; j < x.length; j++) {
                //ask for user to enter number
                System.out.println("enter first element");
                //number gets added to the array x -> we will add array x to the multidimensional array
                x[j] = input.nextInt();
            }
            //array x gets added to the multidimensional array -> its position in the multidimensional array is determined by the outer loop
            num[i] = x;
        }
        //print multidimensional array using deepToString() method
        System.out.println(Arrays.deepToString(num));



    }
}
//creating an array multi