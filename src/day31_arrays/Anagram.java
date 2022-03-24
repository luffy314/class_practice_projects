package day31_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String a ="listen";
        String b ="silent";
        String[] a2=a.split("");
        String[] a3=b.split("");
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));

        Arrays.sort(a2);
        Arrays.sort(a3);

        if(Arrays.equals(a2,a3)){
            System.out.println("anagrams");

        }else {
            System.out.println("not anagrams");
        }




    }
}
