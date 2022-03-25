package my_utilities;

public class ArrayUtil {
    public static int minNumber(int[] arr){
        int smallest=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static int maxNumber(int[] arr) {
        int biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
    /*

Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.

     */

    public static boolean contains(int[] arr,int num) {
        boolean contain = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                contain = true;
                break;
            }
        }
        return contain;
    }
    /*
    Add Element

create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */

    public static int[] addElement(int[] arr,int num){
        int[] arr2=new int[arr.length+1];
        arr2[arr2.length-1]=num;
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        return arr2;
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