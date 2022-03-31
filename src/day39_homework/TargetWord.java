package day39_homework;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        String[] search={"java","html","css", "java", "javascript", "selenium"};
        System.out.println(Arrays.toString(search));
        Arrays.asList(search);

        ArrayList<String> list=new ArrayList<>(Arrays.asList(search));
        System.out.println(list);
        System.out.println(wordCount(list, "java"));

    }
    public static int wordCount(ArrayList<String> example, String word){
        int count=0;
        for(int i=0;i< example.size();i++){
            if(example.get(i).contains("java")){
                count++;
            }
        }
        return count;
    }
}
/*
Target word
Given an ArrayList of Strings and a target word (String) print how many
times the target word is in the ArrayList
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
Target: java
Output:
2
 */