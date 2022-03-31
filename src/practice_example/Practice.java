package practice_example;

public class Practice {
    public static int sumOfIntegers(String str) {
        String number = "0";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number += str.charAt(i);
                if (Character.isDigit(str.charAt(i)) &&  str.charAt(i)==str.charAt(str.length()-1)){
                    sum+= Integer.parseInt(number);
                }
            }

            else  {
                sum+= Integer.parseInt(number);
                number="0";
                continue;


            }

        } //end of for loop.
        return sum;
    }// end of the method

    public static void main(String[] args) {
        String str = "jav452ai1000sgre1at82";
        System.out.println(sumOfIntegers(str));
    }
}
