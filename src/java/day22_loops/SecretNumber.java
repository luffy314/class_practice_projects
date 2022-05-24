package java.day22_loops;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter secret number");

        int a = input.nextInt();
        int b;
        int attempts = 0;
        do {
            System.out.println("guess the secret number");
            b = input.nextInt();
            if (b>a){
                System.out.println("number too high, try again");
            }else if (b<a){
                System.out.println("number too low, try again");
            }
            attempts++;


        } while (b != a);

        if (b==a){
            System.out.println("you guessed correctly, it took u this man attempts " + attempts);
        }


    }
}
/*


--------------------------------------------------------------------------------

create a program to guess the secret number.
flow will be as follows:
define the secret number, hard coded
ask the user to guess a number
based on the guess tell them a message:

  if they guess higher than the number:
      too high

  if they guess lower than the number:
      too low

  if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

Challenge: keep track of the number of attempts taken to guess right
 */