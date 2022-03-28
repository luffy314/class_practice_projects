package day37_homework;

public class UpperLower {
    public static void main(String[] args) {

        String str="JAVA java";
        int upper=0;
        int lower=0;

        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                upper++;
            }else if(Character.isLowerCase(str.charAt(i))){
                lower++;
            }
        }
        System.out.println(upper==lower?"true":"false");

    }
}

/*
Wrapper Classes Practice
-----------------------------------------------------------------------------

Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
	str = "JAVA java";

output:

	true

-----------------------------------------------------------------------------

HTML Generator

Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>

-----------------------------------------------------------------------------

Valid Password

	Given a String password find out if it is a valid password

	Requirements:

		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number
		Must have one of the follow special characters:
			! @ # $ % ^ & *

-----------------------------------------------------------------------------
 */