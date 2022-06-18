package j.day64_functional_interface.homwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    public static void main(String[] args) {

        //        1.1 Create a function that can verify if a number contains duplicate digits
        Predicate<Integer> ifNumContainsDuplicates = num -> {
            ArrayList<String> numbers=new ArrayList<>(Arrays.asList((""+num).split("")));
            for (int i=0;i<numbers.size();i++){
                if(Collections.frequency(numbers,numbers.get(i))>1){
                    return true;}
            }return false;};
        //Checking created method
        System.out.println(ifNumContainsDuplicates.test(233));//true
        System.out.println(ifNumContainsDuplicates.test(123));//false

        // 1.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
//        Password must be at least have 8 characters long, and should not contain space
//        Password should at least contain one upper case letter
//        Password should at least contain one lower case letter
//        Password should at least contain one special characters
//        Password should at least contain a digit
        Predicate<String> ifPasswordStrong = password -> {
            boolean upper=false, lower=false, digit=false, specialChar=false;
            boolean properLength=password.length()>=8; boolean noSpace=!password.contains(" ");
            for (int i = 0; i <password.length() ; i++) {
                char letter=password.charAt(i);
                if(letter!=' '){
                    if(Character.isDigit(letter)){
                        digit=true;
                    }else if(Character.isLowerCase(letter)){
                        lower=true;
                    }else if(Character.isUpperCase(letter)){
                        upper=true;
                    }else{specialChar=true;}}
            }return upper&&lower&&digit&&specialChar&&properLength&&noSpace;};
        //Checking created method
        System.out.println(ifPasswordStrong.test("4gT*5678")); //true
        System.out.println(ifPasswordStrong.test("6789"));//false




    }
}
