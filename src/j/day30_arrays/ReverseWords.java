package j.day30_arrays;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "It started to snow in Chicago";
        String[] words = input.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse = "";
        String words2 = "";


        for (int i = 0; i < words.length; i++) {
            words2 = words[i] + " ";
            for (int j = words2.length() - 1; j >= 0; j--) {
                reverse += words2.charAt(j) + "";
            }
            System.out.print(words2);
        }
        System.out.println();
        System.out.println(reverse.trim());
    }
}
/*
everse Each word

Given a String, reverse each individual word and print the result
Hint: Use a nested loop, split

Input:
It started to snow in Chicago
Output:
tI detrats ot wons ni ogacihC
 */