package day23_loops;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int ascii = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++){
            ascii = str.charAt(i);
            result += ascii + " ";
        }
        System.out.println(result.trim());
    }
}
