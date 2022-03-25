package my_utilities;

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

    public static int[] addElement(int[] nums,int element){
        int[] nums2=new int[nums.length+1];
        nums2[nums2.length-1]=element;
        for(int i=0;i<nums.length;i++){
            nums2[i]=nums[i];
        }
        return nums2;
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