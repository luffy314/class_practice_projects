package j.day65_streams.stream_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExtraPractice {
    public static void main(String[] args) {

    /*
        1. Write a program that can remove the duplicated elements of an array of String
    */

        String [] strs = {"fire", "water", "wind", "fire", "earth", "elements", "water", "wind", "elements"};
        System.out.println("1) " + Arrays.toString(Arrays.stream(strs).distinct().toArray()));

    /*
        2. Write a program that can remove the duplicated elements of a List of String
    */

        List<String> list = new ArrayList<>(Arrays.asList("fire", "water", "wind", "fire", "earth", "elements", "water", "wind", "elements"));
        System.out.println("2) " + list.stream().distinct().collect(Collectors.toList()));

    /*
        3. Write a program that can count how many "java" and "python" does the array has:
                ex: array = {"Java", "jAVa", "pythON"}

                output:
                    countJava = 2
                    countPython = 1
    */

        List<String> list2 = new ArrayList<>(Arrays.asList("java", "python", "JAVA", "java", "PyTHON", "JAva", "c+", "C#", "c", "Python"));
        System.out.println("3) count Java = " + list2.stream().filter( p -> p.equalsIgnoreCase("java")).count());
        System.out.println("3) count Python = " + list2.stream().filter( p -> p.equalsIgnoreCase("python")).count());


    /*
        4. Write a program that can count how many negative numbers does the array has
            ex: arr = {1,2,3,4,-4,5,-5}

            output:
                2
    */
        int [] arr = {1,2,3,4,-4,5,-5};
        System.out.println("4) " + Arrays.stream(arr).filter(p -> p < 0).count());

    /*
        5. Write a program that can count how many Positive numbers does the List has
            ex: List = {1,2,3,4,-4,5,-5}

            output:
                5
    */

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,-2,3,4,-4,5,-5));
        System.out.println("5) " + list3.stream().filter(p -> p > 0).count());

    /*
        6. Write a program that can return all the negative numbers of the array as a new array
            ex:
                arr = {1,2,3,4,-4,5,-5}

            output:
                {-4, -5}
    */

        int [] arr2 = {1,2,3,4,-4,5,-5};
        System.out.println("6) " + Arrays.toString(Arrays.stream(arr2).filter(p -> p < 0).toArray()));

    /*
        7. Write a program that can return all the positive numbers of List without the duplicates
            ex:
                list = {1,2,3,4,-4,5,-5,1,2,3,4}

            output:
                {1,2,3,4,5}
    */

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,-4,5,-5,1,2,3,4));
        System.out.println("7) " + list4.stream().distinct().filter(p -> p > 0).collect(Collectors.toList()));

    /*
        8. Write a program that can return the palindrome Strings from a list:
            Ex:
                list = {"Java", "level", "Anna", "Wooden Spoon"};

            output:
                {"level", "Anna"}
    */
        System.out.println("----------------------");
        List<String> list5 = new ArrayList<>(Arrays.asList("Java", "Level", "Anna", "Wooden Spoon", "racecar"));
        System.out.println("8) " + list5.stream().filter(p ->
                new StringBuilder(p).reverse().toString().equalsIgnoreCase(p)).collect(Collectors.toList()));

    /*
        9. Write a program that can return the unique elements of an array as a new array:

            Ex: arr = {1,1,2,3,3,4,5,5,6};

            output:
                {2,4,6}
    */

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5,6));
        System.out.println(list6.stream().filter(p -> Collections.frequency(list6, p) == 1).collect(Collectors.toList()));

    }
}
