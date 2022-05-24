package java.day32_arrays;

public class Notes {
}
/*
Arrays Class

	utility class for arrays. Has useful methods/action for array objects

	Ex: int [] n = { 5, 1, 4};


	Arrays.toString(): printing array objects

		Arrays.toString(n) --> [5, 1, 4]

	Arrays.sort(): rearrange elements to be in order of smallest to largest
		-> for String elements: Lexicographical

		Arrays.sort(n) --> [1, 4, 5]

	Arrays.equals(): compare two array objects to see if they have the same elements

		int [] a = {1, 4, 5};
		int [] b = {1, 4, 5, 6};

		Arrays.equals(n, a) --> true   | Remember we sorted the n array
		Arrays.equals(a, b) --> false

String methods:

	String.join(): allows the array to be separated by a certain character/s

		String.join("*", n) --> 1*4*5

	--> method works for String array types

____________________________________________________________

More Arrays Class

	Arrays.copyOf()

		two arguments:

			(array, size)

				array: the array you want to copy the elements from
				size: the size of the new array

	Arrays.binarySearch()
		find/search for the position of an element in the array

		--> in order for the method to work, the array must be sorted

		two arguments:

			(array, element)

				array: the sorted array you are checking in
				element: the element you are trying to find the index/position of

		if the element you are looking for is not in the array, then it returns a negative number based on where the position would be + 1

____________________________________________________________

Multidimensional Arrays

	Array inside of an array. The elements of a 2D array is a single dimensional array

	single dimensional array:

		int [] a = {1, 2, 3};

	2D array:

		int [][] arr = {

			{1, 2, 3},
			{4, 5, 6}

		}

		arr[0] --> {1, 2, 3}
		arr[1] --> {4, 5, 6}

		How to access the first element of each inner array

			arr[0][0] --> 1
			arr[1][0] --> 4

	How to print multi dimensional arrays

		Arrays.deepToString()

	int [][][]
		3D array --> elements are 2D --> 1D array

 */