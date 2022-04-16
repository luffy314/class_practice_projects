package day40_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersToSum {
    public static ArrayList<Integer> sumFromString(ArrayList<String> list ){

        ArrayList<Integer> sums = new ArrayList<>();

        for(String each : list){ // goes through every element of the ArrayList from params

            int currentSum = 0;

            for(String eachDigit : each.split("")){  // converting the String, each, to an array by split with an empty space, it means the each String will be seperated with each character as separate String elements
                // "123" --> ["1", "2", "3" and then you loop through that array

                currentSum += Integer.parseInt(eachDigit);

            }

            sums.add(currentSum);
        }

        return sums;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "1111", "34"));
        System.out.println(sumFromString(list));
    }












    }
//        ArrayList<String> words = new ArrayList<>(Arrays.asList("123", "34", "513"));
//        System.out.println(sumOfString(words));
//
//
//    }
//    public static ArrayList<Integer> sumOfString(ArrayList<String> example) {
//        ArrayList<String> words = new ArrayList<>(example);
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        for (int i = 0; i < words.size(); i++) {
//            int a = words.get(i).length();
//            int b = 0;
//            for (int j = a - 1; j >= 0; j--) {
//                b += words.get(i).charAt(j)-48;
//            }
//            numbers.add(i,b);
//        }
//        return numbers;
//    }
//}
/*
String numbers to sum
Create a method that will accept an ArrayList of numbers in String
format, add each digit of each element and store into a different
ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
 */