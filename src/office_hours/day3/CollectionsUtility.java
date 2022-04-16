package office_hours.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        /*

        What is difference between COLLECTION and COLLECTIONS ?

              COLLECTION --> It is an interface

              COLLECTIONS --> It is UTILITY CLASS that contains swap(), sort(),reverse() etc.



         */


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,-5,0,-1,30,7,8,20,20,20));



        // sort()    : sort the given collection
        System.out.println("------SORT-------");
        Collections.sort(numbers);
        System.out.println(numbers);


        // reverse() : reverse the order of the elements in given collection
        System.out.println("------SORT-------");
        Collections.reverse(numbers);
        System.out.println(numbers);

        // max()     : returns the biggest element
        System.out.println("------MAX-------");
        System.out.println(Collections.max(numbers));


        // min()     : returns the smallest element
        System.out.println("------MIN-------");
        System.out.println(Collections.min(numbers));


        /*
        Find me second max number from arraylist
       numbers.addAll(Arrays.asList(10,10,-5,0,-1,30,7,8,20,20,20));

    */
        System.out.println("------THIRD MAX -------");

        numbers.removeIf(each-> Collections.max(numbers)==each);
        // it will remove first max value fom arraylist
        Integer secondMax=Collections.max(numbers);
        System.out.println(secondMax);

        numbers.removeIf(each->Collections.max(numbers)==each);
        int thirdMax=Collections.max(numbers);
        System.out.println(thirdMax);
        System.out.println(numbers);



        // swap()    : swap the elements in the collection with their indexes
        System.out.println("------SWAP -------");

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);


        // frequency(c,o):
        // c – the collection in which to determine the frequency of o
        //o – the object whose frequency is to be determined
        System.out.println("------FREQ -------");

        System.out.println(Collections.frequency(numbers, 10));


    }
}
