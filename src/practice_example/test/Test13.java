package practice_example.test;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Stack;

public class Test13 {

    static{
        System.out.println("poop");
    }

    public static void main(String[] args) {

//final instanee method

        Object one= new ArrayList<>();
        AbstractCollection two=new ArrayList<>();
        System.out.println(two.getClass().getSuperclass());


    }




}
