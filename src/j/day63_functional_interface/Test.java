package j.day63_functional_interface;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

    String one= "cool";
    String reverse = new StringBuilder("wolf").reverse().toString();
    String reverse2 = new StringBuilder(one).reverse().toString();
        System.out.println(reverse);

        StringBuilder two= new StringBuilder("chicken");
        System.out.println(two);

        int[] three={2,3,4};
        ArrayList<int[]> four= new ArrayList<>(Arrays.asList(three));
        System.out.println(four);

        int[] ints = new int[] {1,2,3,4,5};

        System.out.println(Arrays.toString(ints));

        String[] poo=new String[]{"help"};
        String[] poop={"help"};
        String a="";
        String b="help";
        for (String each : poop) {
            a+=each;
        }
        System.out.println(a);
        System.out.println(a.equals(b));


    }
}
