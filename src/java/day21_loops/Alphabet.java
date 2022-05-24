package java.day21_loops;

public class Alphabet {
    public static void main(String[] args) {

        char letter = 'Z';

        while(letter >= 'A'){
            System.out.println(letter);
            letter--;
        }

    }
}


/*
While Loop Practice

write a program that will print all the alphabet letters in lowercase from 'a' to 'z'

write a program that will print all the alphabet letters in uppercase from 'A' to 'Z'

write a program that will print all the alphabet letters backwards in lowercase from 'z' to 'a'

write a program that will print all the alphabet letters backwards in uppercase from 'Z' to 'A'

write a program that will add all the numbers from 1 - 500

write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
	1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
	2.  For numbers which are divisible by 5, print "Buzz" instead of the number
	3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number

Try with Scanner:

	write a program that will add 5 numbers from the console

 */