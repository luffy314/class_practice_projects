package office_hours.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombineArrayList {
    public static void main(String[] args) {


        /*
         1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];

            2. write a program that can swap the first and last elements of an ArrayList

            3. write a program that can multiply each odd number by 2
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]

            4. write a program that can combine two String arrays into one arrayList
                        ex:
                            arr1 = {"A", "B", "C"};
                            arr2 = {"D", "E", "F", "G"};
                            list ==> {"A", "B", "C", "D", "E", "F", "G"}

         */


            System.out.println("=== TASK 1 ====");

            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
            System.out.println(numbers);
            numbers.set(numbers.size() - 1, 0);
            System.out.println(numbers);

            System.out.println("=== TASK 2 ====");
            Collections.swap(numbers, 0, numbers.size() - 1);
            System.out.println(numbers);

            System.out.println("=== TASK 3 ====");

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 1) { // it means it is ODD numbers
                    numbers.set(i, numbers.get(i) * 2);
                }
            }
            System.out.println(numbers);


            System.out.println("=== TASK 4 ====");

            String[] arr1 = {"A", "B", "C"},
                    arr2 = {"D", "E", "F", "G"};

            ArrayList<String> result = new ArrayList<>();
            result.addAll(Arrays.asList(arr1));
            System.out.println(result);
            result.addAll(Arrays.asList(arr2));
            System.out.println(result);


            System.out.println("=== TASK 4 with CHAR  ====");

            char[] carr1 = {'A', 'B', 'C'},
                    carr2 = {'D', 'E', 'F', 'G'};

            ArrayList<Character> charResult = new ArrayList<>();
            //charResult.addAll(Arrays.asList(carr1));
            for (char eachChar : carr1)  charResult.add(eachChar);


            System.out.println(charResult);

            //charResult.addAll(Arrays.asList(carr2));
            for (char eachChar : carr2)  charResult.add(eachChar);

            System.out.println(charResult);


        }


    }
