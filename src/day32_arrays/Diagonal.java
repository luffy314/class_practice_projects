package day32_arrays;

import java.util.Arrays;

public class Diagonal {
    public static void main(String[] args) {

        int[][] num={{3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}};
        int aei = num[0][0]+num[1][1]+num[2][2];
        int ceg = num[0][2]+num[1][1]+num[2][0];
        System.out.println(Arrays.deepToString(num));
        System.out.println(""+aei + "\n"+ceg);

        if(aei>ceg){
            System.out.println("aei is bigger");
        }else if (aei==ceg){
            System.out.println("they're equal");
        }else {
            System.out.println("ceg is bigger");
        }




    }
}
/*
Multidimensional Array Practice
------------------------------------------------------------------------

Given a 2D array with values:

	{3, 5, 1}
	{1, 6, 10}
	{5, 21, 10}


Calculate and find the biggest diagonal

	if an array was

	a b c
	d e f
	g h i

	aei and ceg would be the diagonals

------------------------------------------------------------------------

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

------------------------------------------------------------------------

Create an empty 2D array with size 10 and each inner array with size 10.
Fill the elements of the 2D array with numbers from 1 - 100 where each array starts from the number after the last number in the previous array.
The goal is to print the numbers of 1-10, 11- 20, 21-30, etc.. until the end on separate lines

Ex:

	1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	11, 12, 13, 14, 15, 16, 17, 18, 19, 20
	21, 22, 23, 24, 25, 26, 27, 28, 29, 30
	etc

------------------------------------------------------------------------

Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

Ex:

	{"James", "is", "back"}
	{"he", "was", "never", "gone"}
	{"methods", "tomorrow"}

Output:
	ssk
	esre
	sw
 */