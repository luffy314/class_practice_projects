package j.day19_Strings;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first name");
        String first = input.nextLine().trim();
        System.out.println("enter last name");
        String last = input.nextLine().trim();

        char first2 = input.next().toUpperCase().charAt(0);//input.next doesnt work as well as first varable name
        char last2 = input.next().toUpperCase().charAt(0);



        System.out.println(first2 +""+ last2);

    }
}
