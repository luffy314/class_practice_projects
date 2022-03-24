package day28_arrays;

import java.util.Arrays;

public class StudentInformation {
    public static void main(String[] args) {
        String [] month = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};

        System.out.println((Arrays.toString(month)).substring(1,(Arrays.toString(month).length()-2)));
    }
}
