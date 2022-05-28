package j.day48_encapsulation;

import java.util.Arrays;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class static_import {
    public static void main(String[] args) {
        int [] a = { 4, 12, 5, 25};

        sort(a);

        System.out.println(Arrays.toString(a));

        System.out.println(PI);

        System.out.println(abs(-1)); // Math.abs()
    }
}
