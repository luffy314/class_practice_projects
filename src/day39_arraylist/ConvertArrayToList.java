package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        // Scanner [] s = new Scanner[2];

        Integer [] arr = {1, 2, 3}; // we made an Integer array because ArrayList does not accept primitive types

        Arrays.asList(arr); // converts the array to a collection type (ArrayList)

        ArrayList<Integer> nums = new ArrayList<>( Arrays.asList(arr) ); // creating an ArrayList with values from a collection type
        System.out.println(nums);

        // Creating an ArrayList with some initial values

        ArrayList<Integer> other = new ArrayList<>( Arrays.asList(4, 5, 6, 7) );
        System.out.println(other);

        /*
           Arrays.asList(4, 5, 6, 7)
            [4, 5, 6, 7] --> converts to ArrayList [ 4, 5, 6, 7]

         */


    }
}
