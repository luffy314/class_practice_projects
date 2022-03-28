package my_utilities;

import java.util.Arrays;

public class ArrayUtil {
    public static int minNumber(int[] nums) {

        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maxNumber(int[] nums) {

        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    /*

Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.

     */

    public static boolean contains(int[] nums, int element) {

        for (int each : nums) {

            if (each == element) {
                return true;
            }
        }
        return false;
    }

    /*
    Add Element

create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */

    public static int[] addElement(int[] nums, int element) {
        int[] nums2 = new int[nums.length + 1];
        nums2[nums2.length - 1] = element;
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }
        return nums2;
    }

    /*
    Used to find the first index of the element in the int array
     */

    public static int indexOf(int[] nums, int element) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }

        return -1;
    }

      /*
    Used to find the first index of the element in the string array
     */


    public static int indexOf(String[] strs, String element) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    /*
    adds a new string to a string array by crating a bigger String array
     */
    public static String[] addElement(String[] original, String element) {
        String[] combine = new String[original.length + 1];
        combine[combine.length - 1] = element;
        for (int i = 0; i < combine.length; i++) {
            if(i<original.length)
            combine[i] = original[i];
        }
        return combine;
    }

    /*
    used to add a new int array to an original one to create a bigger one
     */
    public static int[] addElement(int[] original, int[] elementsToAdd) {

        int[] newArray = new int[original.length + elementsToAdd.length];

        for (int i = 0, j = 0; i < newArray.length; i++) {

            if (i < original.length) {
                // added the elements from the original array in the new array
                newArray[i] = original[i];
            } else {
                // added the new elements to the new array
                newArray[i] = elementsToAdd[j++];
            }

        }

        return newArray;
    }
}

/*

Utility Classes
Create the following in the StringUtil class:
____________________________________________________________

Min Number

create a method that will accept an int array and return the smallest number from the array

--------------------------------------------------

Max Number

create a method that will accept an int array and return the biggest number from the array

--------------------------------------------------

Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.

--------------------------------------------------

Add Element

create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array

 */