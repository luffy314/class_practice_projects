package practice_example;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {

    public static void main(String[] args) {
        int[] num1=new int[1];
        int [] num2= new int[5];
        num1=num2;
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        String c="help";
        String b="death";

        c="win";
        System.out.println(c);
        System.out.println(b);

    }
}
