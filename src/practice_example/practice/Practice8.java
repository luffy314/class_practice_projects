package practice_example.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int day= 0;
        int[] inhabitantsStatus={};
        while (inhabitants[input.nextInt()] > 1 && inhabitants[input.nextInt()] <= inhabitants.length-1){
            System.out.println("Day " + day +" ["+ Arrays.toString(inhabitants) +"]");
            Arrays.asList(inhabitantsStatus).equals(inhabitants.length /2);
            day++;

        }
        System.out.println("---- EXTINCT ----");


    }
}
//delete