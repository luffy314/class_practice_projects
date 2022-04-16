package office_hours.day1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCombine {
    public static void twoArrays(int[] one, int[] two) {

        int[] third=new int[one.length+two.length];
        for(int i=0, j=0;i<one.length;i++,j++){
            third[j]=one[i];

        }
        for(int i=0,j=0;i<two.length;i++,j++){
            third[one.length+j]=two[i];
        }
        System.out.println(Arrays.toString(third));


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how big is your first array");
        int[] first = new int[input.nextInt()];
        for (int i = 0; i < first.length; i++) {
            System.out.println("enter ur numbers");
            first[i] = input.nextInt();
        }
        System.out.println("how big is your second array");
        int[] second = new int[input.nextInt()];
        for (int i = 0; i < second.length; i++) {
            System.out.println("enter ur numbers");

            second[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        twoArrays(first,second);

    }
}
/*
Task 2 :   Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
/*

    public  static void mergeTwoArray(int[] array1, int[] array2) {

    int[] arr3=new int[array1.length+ array2.length];

    int i=0;

        for (int each : array1) {

            arr3[i++]=each;

            /*


            arr3[0]=1
            arr3[1]=2
            arr3[2]=3
            arr3[3]=4


        }

/*
                for (int each : array2) {

                arr3[i++]=each;

                }

                Arrays.sort(arr3);  // to sort our new Arrays
                System.out.println(Arrays.toString(arr3));


 */