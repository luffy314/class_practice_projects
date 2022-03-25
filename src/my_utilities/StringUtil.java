package my_utilities;

import java.util.Arrays;
import java.util.Currency;

public class StringUtil {
      /*
        reverse
        create a method that will accept a String and return the reversed version
     */

    public static String reverse(String words) {
        String reversed = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            reversed += words.charAt(i) + "";
        }
        return reversed;
    }

//    Currency Converter
//    create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

    public static double currencyConverter(String type, double amount) {
        double output;
        switch (type.toLowerCase().trim()) {
            case "euro":
                return 0.91 * amount;
            case "yen":
                return 121.83 * amount;
            case "lira":
                return 14.85 * amount;
            case "won":
                return 1217.52 * amount;
            case "rupee":
                return 181.45 * amount;
            default:
                return 0;

        }
    }

    /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase
     */
    public static String fixFormat(String words) {
        String fix = words.trim().toLowerCase();
        return fix.substring(0, 1).toUpperCase() + fix.substring(1);
    }


    /*

Camel Case

create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase
     */

    public static String camelCase(String str) {
        str = str.trim().toLowerCase();
        String camelCase = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                camelCase += ("" + str.charAt(i + 1)).toUpperCase();
                i++;
            } else {
                camelCase += str.charAt(i);
            }

        }
        return camelCase;
    }

    /*
    Frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
     */

    public static int frequencyOfCharacter(String str, char letter) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter) {
                count++;
            }

        }
        return (count);

    }

    /*

Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work
     */

    public static String uniqueCharacters(String words) {
        String unique = "";
        String checked = "";

        for(int i = 0; i < words.length(); i++){

            if(!checked.contains("" + words.charAt(i))){
                int count = StringUtil.frequencyOfCharacter(words, words.charAt(i));
                checked += words.charAt(i);

                if(count == 1){
                    unique += words.charAt(i);
                }
            }
        }
            if (unique.isEmpty()) {
                return "No unique chars";
            }
        return unique;
    }

    /*
    Duplicate Characters

create a method that will accept a word(String) and return a String with all the duplicate characters. A character is duplicate if it only appears in the String multiple times

Hint: use your frequency method to do some of the work

     */

    public static String duplicateCharacters(String words) {
        words=words.trim().toLowerCase();
        String duplicate = "";
        for (int i = 0; i < words.length(); i++) {
            if (duplicate.contains(words.charAt(i) + "")) {
                continue;
            }
            if (frequencyOfCharacter(words, words.charAt(i)) > 1) {
                duplicate += words.charAt(i);
            }
            }
        if (duplicate.isEmpty()) {
            return "No duplicate chars";
        }
        return duplicate;

    }
    public static int minNumber(int[] arr){
        int smallest=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static int maxNumber(int[] arr) {
        int biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
    public static boolean contains(int[] arr,int num) {
        boolean contain = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                contain = true;
                break;
            }
        }
        return contain;
    }
    public static int[] addElement(int[] arr,int num){
        int[] arr2=new int[arr.length+1];
        arr2[arr2.length-1]=num;
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        return arr2;
    }


}



/*
Currency Converter

create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method

Ex:
	Input:
		euro, 100

	Output:
		91

Ex:
	Input:
		yen, 50

	Output:
		6051.5
____________________________________________________________

Utility Classes
Create the following in the StringUtil class:
____________________________________________________________

Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James

--------------------------------------------------

Camel Case

create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase

Ex:
	Input:
		JAVA will ruLE tHe wORLd

	Output:
		javaWillRuleTheWorld

--------------------------------------------------

Frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word

Ex:
	Input:
		apple, p

	Output:
		2

Ex:
	Input:
		apple, z

	Output:
		0

Ex:
	Input:
		aabbaacca, a

	Output:
		5
--------------------------------------------------

Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work

Ex:
	Input:
		aaaaabcccdeeff

	Output:
		bd

--------------------------------------------------

Duplicate Characters

create a method that will accept a word(String) and return a String with all the duplicate characters. A character is duplicate if it only appears in the String multiple times

Hint: use your frequency method to do some of the work

Ex:
	Input:
		aaaaabcccdeeff

	Output:
		acef


 */