package j.day40_arraylist.homework;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(countLetters(list, 'a'));
    }

    public static int countLetters(ArrayList<String> list, char letter){

        int count = 0;

        for (String element: list){
            count += StringUtil.frequencyOfCharacter(element, letter);
        }

        return count;

    }

}
/*
Count Letters
Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
letter: ‘a’
Output:
6
 */