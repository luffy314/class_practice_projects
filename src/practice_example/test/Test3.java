package practice_example.test;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;

        int d = (a < b) ? ((a < c) ? a : c) : ((c < b) ? c : b);

        System.out.println((a < b) ? ((a < c) ? a : c) : ((c < b) ? c : b));


        // create a variable
        int n1 = 2, n2 = 9, n3 = -11;

        // nested ternary operator
        // to find the largest number
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number: " + largest);


        int x = 100;
        int l = x++;
        int m = ++x;
        int n = x++;


        int g = (l < m) ? ((l < n) ? l : n) : ((m < n) ? m : n);

        int e;
        if ((l < m)) {
            e = ((l < n) ? l : n);
        } else {
            if (m < n) e = m;
            else e = n;
        }

        System.out.println(d);

//        int d;
//        if ((a < b)) {
//            if (a < c) d = a;
//            else d = c;
//        } else {
//            d = ((b<c)?b:c);
//        }


        String p = "test";
        String q="t"+"e"+"s"+"t";

        String i="te";
        String j="st";
        String k=i+j;
        System.out.println(p==q);
        System.out.println(p==k);
        System.out.println(k==q);



    }
}
