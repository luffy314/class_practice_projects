package day28_arrays;

import java.util.Arrays;

public class OneHundred {
    public static void main(String[] args) {
        int[] num = new int[100];
        System.out.println(num);
        System.out.println(Arrays.toString(num));
        for(int i=0;i<num.length;i++){
            num[i]=i+1;
            System.out.println(num);
        }
        System.out.println(Arrays.toString(num));
    }
}
/*
100 number array
1. Create an int array called numbers that has length of 100
2. Assign 1-100 to each index of the array. Then print your number
array
 */