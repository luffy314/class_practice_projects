package day33_methods;

import java.util.Locale;

public class Palindrome {
    public static void palindrome(String a){
        boolean isPalindrome= true;
        for (int i = 0; i < a.length()/2; i++) {
            if(!(a.toLowerCase().charAt(i)==a.toLowerCase().charAt(a.length()-i-1))){
                isPalindrome=false;
                break;
            }
            }
        if(isPalindrome){
            System.out.println("it's a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        }


    public static void main(String[] args) {
        String check= "racecar";
        palindrome(check);
    }
}
/*
create a method that will that will accept a String and find if it is
Palindrome or not
 */