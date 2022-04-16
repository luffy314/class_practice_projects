package day39_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>(Arrays.asList("apples","tree","loop", "cat", "animal", "shortcut"));
        System.out.println(list);

        System.out.println(fourOrLess(list));

    }
    public static ArrayList<String> fourOrLess(ArrayList<String> example){
        ArrayList<String> words=new ArrayList<>();

        for(int i=0;i<example.size();i++){
            if(example.get(i).trim().length()<5){
                words.add(example.get(i));
            }
        }
        return words;
    }
}
/*
Four or less
Given an ArrayList of Strings, go through and find Strings that are 4
characters or less. Take those Strings and put them into a different
ArrayList. Print that ArrayList of words
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
Output:
[ tree, loop, cat ]
 */