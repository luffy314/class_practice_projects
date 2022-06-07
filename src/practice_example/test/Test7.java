package practice_example.test;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {

        Character[] two=new Character[]{'f','g','h'};
        char[] three=new char[]{'f','t','y'};
        String four="body";
        int[] six={3};

        List<Character> one=new ArrayList(Arrays.asList(two)) {
        };
        List<Character> five=new ArrayList(Arrays.asList(four.toCharArray())) {
        };
        List<int[]> nine=new ArrayList(Arrays.asList(six)) {
        };
//        one.addAll(Arrays.asList('c','b'));
        System.out.println(Arrays.asList(nine.get(0)));
        System.out.println(one);
        System.out.println(five);
        System.out.println(nine);

        int[] ar1 = new int[]{1,2};
        System.out.println(Arrays.asList(ar1).size());

    }
    }

