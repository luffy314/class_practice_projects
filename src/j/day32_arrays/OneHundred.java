package j.day32_arrays;

import java.util.Arrays;

public class OneHundred {
    public static void main(String[] args) {
        int [][] a=new int[10][10];
        int b=1;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=b++;
            }
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
/*
Create an empty 2D array with size 10 and each inner array with size 10.
Fill the elements of the 2D array with numbers from 1 - 100 where each array starts from the number after the last number in the previous array.
The goal is to print the numbers of 1-10, 11- 20, 21-30, etc.. until the end on separate lines

Ex:

	1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	11, 12, 13, 14, 15, 16, 17, 18, 19, 20
	21, 22, 23, 24, 25, 26, 27, 28, 29, 30
	etc

 */