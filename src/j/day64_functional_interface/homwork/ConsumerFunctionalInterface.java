package j.day64_functional_interface.homwork;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {

        //        1.1    Create a function that prints the first and last element of an array
        Consumer<int[]> print1stAndLastElOfArr= n->{
            System.out.println("First array element: " + n[0]+".");
            System.out.println("Last array element: " + n[n.length-1]+".");};
        //Checking created function
        int [] arr={1,3,7,8,9,0};
        print1stAndLastElOfArr.accept(arr);//First array element: 1. //Last array element: 0.

//        1.2 Create a function that prints the middle character/s of a String
        Consumer<String> printMidCharOfStr= n-> {
            System.out.println((n.length()%2==0)?n.substring(n.length()/2-1,n.length()/2+1)
                    :n.charAt(n.length()/2));};
        //Checking created function
        String str1="Sun"; //odd amount of chars
        printMidCharOfStr.accept(str1); //u
        String str2="Moon"; //even amount of chars
        printMidCharOfStr.accept(str2);//oo


    }
}
