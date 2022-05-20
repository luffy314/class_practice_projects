package practice_example;

public class SumOfDigits {
      /*
    Write a function that can return the sum of digits of an integer, Do not use any string manipulations
        Ex:
            input: 123
            output: 6

     */

    public static void main(String[] args) {



        int number =-12345;                     //operation
        System.out.println(number%10); //always gives us the last digit
        System.out.println(number/10); // basically removes the last digit since we use integer
        System.out.println(1/10); // gives zero since we use integer

        System.out.println(sumOfDigits(number));

        System.out.println();
        System.out.println(sumOfDigitsWithStringMnp(number));

    }

    public static int sumOfDigits(int number){

        int sum = 0;

        number = Math.abs(number); //made it positive number, gets the absolute value

        //since i don't know the iteration number, need to use while loop
        while (number>0){
            sum += number%10; //added the last digit to sum value
            number = number / 10; //removed the last digit from number
            //number /= 10; same thing
        }

        return sum;

    }


    public static int sumOfDigitsWithStringMnp(int number){
        System.out.println("String manipulation");
        int sum=0;

        //number = Math.abs(number); //it can be used instead of if statement with Character class below (to remove the minus)

        String numStr = ""+number; // converts int into a String
        //String num2 = String.valueOf(number); // converts int into a String
        //String num3 = Integer.toString(number); // converts int into a String


        if(!Character.isDigit(numStr.charAt(0))){
            numStr =  numStr.substring(1); //removes the minus at first index
        }


        //we don't need to use while loop for that time
        for (int i = 0; i < numStr.length(); i++) {
            sum += Integer.parseInt(numStr.charAt(i)+"");
        }

        return sum;
    }
}
