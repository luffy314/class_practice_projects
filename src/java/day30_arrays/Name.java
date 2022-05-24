package java.day30_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first name");
        String name = input.nextLine();

        char[] name2=name.toCharArray();
        System.out.println(Arrays.toString(name2));

        System.out.println(""+name2[0]+name2[name2.length-1]);




    }
}
/*
Array & String Practice
____________________________________________________________

Ask the user to enter their first name
Convert the name into a char array
print the first and last letter of the name
____________________________________________________________




 */