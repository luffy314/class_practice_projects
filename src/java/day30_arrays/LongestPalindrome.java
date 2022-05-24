package java.day30_arrays;

public class LongestPalindrome {


        //interview question
 /*
    [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
        Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome

     */

        public static void main (String[]args){

            String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
            String longestPalindrome = "";

            // outer loop is iterating through the array
            for (String eachWord : words) { // eachWord == words[i]

                boolean isPalindrome = true;

                // inner loop is iterating through each String element
                for (int i = 0; i < eachWord.length() / 2; i++) {

                    if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }

                }

                if (isPalindrome && eachWord.length() > longestPalindrome.length()) {
                    longestPalindrome = eachWord;
                }


            }
        }
    }

/*
 String[] words = {"abc", "dna", "kevin", "joe", "lamp"};

        String longestPrime = "";

        for (int i = 0; i < words.length; i++) {

            String reverseWord = "";


            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverseWord += words[i].charAt(j) + "";
            }

            if (reverseWord.equals(words[i]) && words[i].length() > longestPrime.length()) {
                longestPrime = words[i];
            }

        }
        if (longestPrime.isEmpty()){
            System.out.println("No palindrome");
        }else {
            System.out.println(longestPrime);
        }




        String [] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "abababa"};
        String reverse = "";
        int longest = Integer.MIN_VALUE;
        String result = "";

        for(String elements: arr){

            for (int i = elements.length() - 1; i >= 0; i--){
                reverse += elements.charAt(i);
            }

            if(reverse.equals(elements)){
                if(longest <= elements.length()){
                    if(longest == elements.length()){
                        result += " and " +  elements;
                    } else{
                        result = elements;
                    }
                    longest = elements.length();
                }
            }
            reverse = "";
        }

        System.out.println("\n----------RESULT---------");

        System.out.println( result.isBlank() ? "No palindrome" : "The longest Palindrome String: " + result);
    }
 */