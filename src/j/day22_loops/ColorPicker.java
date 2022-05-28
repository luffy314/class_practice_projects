package j.day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int colorsPicked = 0;
        String uniqueColors = "";

        while(colorsPicked < 3){

            System.out.println("Pick a color");
            String color = input.nextLine();

            if(uniqueColors.contains(color)){
                System.out.println("You already have that color");
            } else {
                // if we are here, it means the color is unique
                uniqueColors += color + " ";
                colorsPicked++;
            }

        }

        System.out.println(uniqueColors);

    }
}
