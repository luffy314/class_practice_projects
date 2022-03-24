package day22_loops;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a=10;
        a= --a + a++ + a-- + a++;
        System.out.println(a);
    }
}
