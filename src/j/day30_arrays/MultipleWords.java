package j.day30_arrays;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String input = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] words=input.split(",");
        System.out.println(words);
        System.out.println(Arrays.toString(words));

        for(int i=0; i<words.length;i++){
            if(words[i].trim().contains(" ")){
                System.out.println(words[i]);
            }
        }



    }
}
/*
Multiple Words

Given a String of words that are separate by commas. Find and print any words that have more than one word

Example

	Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

	Output:
	wooden spoons
	trash can
	dish washer
 */