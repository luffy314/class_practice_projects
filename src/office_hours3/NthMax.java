package office_hours3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMax {
        /*
     Task 2 : write a program that can return the nth largest number from an arraylist

                                arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
                                n = 5

                                output:
                                    4
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));
        System.out.println(numbers);
        int n=3;
        System.out.println(NthMax(numbers, n));


    }

    public static int NthMax(ArrayList<Integer> numbers, int n) {


        for (int i = 1; i < n; i++) {
            numbers.removeIf(each-> Collections.max(numbers)==each);
            System.out.println(numbers);
        }

        return Collections.max(numbers);
    }
}
