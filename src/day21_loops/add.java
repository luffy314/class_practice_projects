package day21_loops;

public class add {
    public static void main(String[] args) {

        int i = 0;
        int result = 0;
        int end = 100;

        while (i++ <=end){

            System.out.println(result);
            result+=i;
        }


    }
}

/*
write a program that will add all the numbers from 1 - 500

write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
	1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
	2.  For numbers which are divisible by 5, print "Buzz" instead of the number
	3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number

Try with Scanner:

 */