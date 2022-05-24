package java.day21_loops;

public class Fizzbuzz {
    public static void main(String[] args) {

        int i = 0;
        int end = 50;

        while (i++ <50){
            if (i%3==0 && i%5==0){
                System.out.println(i + " fizzbuzz");
            }else if (i%3==0) {
                System.out.println(i + " fizz");
            }else if (i%5==0) {
                System.out.println(i + " buzz");
            }else {
                System.out.println("eat dick");
            }
        }


    }
}

/*

write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
	1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
	2.  For numbers which are divisible by 5, print "Buzz" instead of the number
	3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number

Try with Scanner:
 */