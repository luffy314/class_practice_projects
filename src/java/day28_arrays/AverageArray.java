package java.day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers");
        int num = input.nextInt();
        double total = 0;
        double average=0;

        double[] ave = new double[num];

        for(int i=0; i<ave.length;i++){
            System.out.println("enter numbers to find average");
            ave[i]= input.nextInt();

        }
        for (int i = 0; i <ave.length; i++) {
            total = total + ave[i];
        }

        average=total/ave.length;

        System.out.println(total);
        System.out.println(Arrays.toString(ave));
        System.out.println(average);

    }
}
/*
Average Number from Array
Given an int array calculate the average number
-> Make it flexible so it will work with any array size
 */