package day25_recap;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two words");
        String word1=scan.nextLine().replace(" ","");// listen
        String word2= scan.nextLine().replace(" ","");//si-ent

        for (int i = 0; i < word1.length(); i++) {

            if(word2.contains(word1.substring(i,i+1))) {
                word2=word2.replaceFirst(word1.substring(i,i+1), " "); }


        }
        if(word2.isBlank() && word1.isBlank()){
            System.out.println("Words are anagram");
        }else{
            System.out.println("words are not anagram");
        }

    }



}
