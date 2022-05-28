package j.day11_if_statements;

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("time of the day, 0 to 24");
        int a = input.nextInt();

        if (a>=6 && a<=11){
            System.out.println("good morning");

        }



//        create an int value for the time of the day. Use a 24 hour format
//        use the given time of day to display a message
//        hint: use seperate if statements
//
//        if the hours are from 6 - 11, print: Good morning
//        if the hours are from 12 - 16, print: Good evening
//        if the hours are from 17 - 23, print: Good night

    }
}
