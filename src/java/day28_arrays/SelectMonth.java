package java.day28_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type the month u want by putting in number 1 to 12");
        int num = input.nextInt();
        String [] month = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        System.out.println(month[num-1]);

    }
}
