package java.day40_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>(Arrays.asList("ted","talk","learn"));

        System.out.println(reverseElement(words));

    }

    public static ArrayList<String> reverseElement(ArrayList<String> example){
        ArrayList<String> words=new ArrayList<>(example);

        for(int i=0;i<words.size();i++){
            int a= words.get(i).length();
            String b="";
            for(int j=a-1;j>=0;j--){
                b+=words.get(i).charAt(j);
            }
            words.set(i,b);

        }
        return words;
    }

}

/*
Reverse All
Create a method that will take an ArrayList of Strings and
reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings
@return - ArrayList of Strings

Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
 */