package j.day33_methods;

public class OddEven {
    public static void odd(){
        for(int i=0;i<=100;i++){
            if(!((i%2==0))){
                System.out.print(i+ " ");

            }
        }
    }
    public static void even() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        odd();
        System.out.println();
        even();
    }
}
/*
create a method that can print odd numbers between 1-100 in the
same line saperated by space
create a method that can print even numbers between 1-100 in the
same line saperated by space
______________________________________________________________________
create a method that will accept an age and determine if the person is
eligible to vote. Person must be 18 years or older to vote
______________________________________________________________________
create a method that will accept a number. Find and print if it is a
positive number, negative number, or zero
______________________________________________________________________
Create a method that will that accepts three numbers. Check if the three
numbers equal to 180.
If they are equal to 180 print: "This is a triangle"
If they are equal to 360 print: "This is a circle"
______________________________________________________________________
create a method that accepts a String and print each character of the
String on a seperate line
______________________________________________________________________
create a method that will that will accept a String and find if it is
Palindrome or not
______________________________________________________________________
Create a method that accept an int array. Take the sum of all the numbers
and print the result
______________________________________________________________________
Create a method that accepts an int array and a number. Check if the array
contains that number or not
Ex:
input: ( {1, 2, 3, 4}, 4 ) -> true
input: ( {1, 2, 3, 4}, 7 ) -> false
______________________________________________________________________
Create a method that accepts an int array. Count how many even and odd
numbers there is. Print an array at the end where the first element is how
many even numbers there was and the second element in the number of odd
elements
Ex:
input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
input: ( {1, 3, 5, 2}) -> [ 1, 3 ]
 */