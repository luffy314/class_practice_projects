package j.day31_arrays;

import java.util.Scanner;

public class ShortestWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] str2 = str.split(",");
//        System.out.println(Arrays.toString(str2));
        String output="";
        int shortest=str2[0].trim().length();
        String complete ="";

        for(int i=0;i<str2.length;i++){

            if(str2[i].trim().length()<shortest){
                shortest = str2[i].trim().length();

            }

        }
        for(int i=0;i<str2.length;i++){
            if(str2[i].trim().length()==shortest){
                output+=", "+ str2[i].trim();
            }
        }

        complete="["+output+"]";
        System.out.println(complete.replaceFirst(", ",""));


//        System.out.println(shortest);
//        String[] str3=output.split(",");
//        System.out.println(Arrays.toString(str3));





    }
}
