package office_hours.day1;

import java.util.Arrays;
import java.util.Scanner;

public class ExtraSpace {
    public static void x(String a){
        String [] b = a.split(" ");
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < b.length; i++) {
            if(b[i].equals("")){
                continue;
            }else{
                System.out.print(b[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        x("  Hello    world      I      love      Java    ");
    }
}
/*
 Task 3 :    Write a method that can remove  all extra space from String


    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java
 */