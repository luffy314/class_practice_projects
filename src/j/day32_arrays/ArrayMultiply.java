package j.day32_arrays;

import java.util.Arrays;

public class ArrayMultiply {
    public static void main(String[] args) {
        int [][]array1={{1, 2, 3}, {2, 5, 10}, {0, 3, 20}};
        int [][]array2={{10, 4, 3},{5, 2, 7},{100, 20, 5}};

        int[][]result=new int[array1.length][array1[0].length];
        //  {{0, 0, 0},{0, 0, 0},{0, 0, 0}}


        for (int i = 0; i <array1.length ; i++) {
            //{2,5,10}

            for (int j = 0; j < array1[i].length ; j++) {

                int multiplication= array1[i][j]*array2[i][j];
                // System.out.println(multiplication);
                result[i][j]=multiplication;

            }


        }
        System.out.println(Arrays.deepToString(result));

    }
}
/*
Given two 2D arrays multiply them together and store the results into a new 2D array. Multiple each number in each position as its own calculation

Ex:

	{1, 2, 3}
	{2, 5, 10}
	{0, 3, 20}

		x

	{10, 4, 3}
	{5, 2, 7}
	{100, 20, 5}

Output:

	{10, 6, 9}
	{10, 10, 70}
	{0, 60, 100}
 */