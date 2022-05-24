package java.day14_nestedstatements;

import java.util.Scanner;

public class Access {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode: ");
        int actualPin = input.nextInt();
        System.out.println("Please enter the last 4 digits of your ssn");
        int actualSSN = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;

        if(actualPin == expectedPin && actualSSN == expectedSSN){
            System.out.println("Authentication successful");
        } else {

            System.out.println("Authentication failed");

            if(actualPin != expectedPin){
                System.out.println("incorrect pin code");
            }

            if(actualSSN != expectedSSN){
                System.out.println("incorrect ssn");
            }

        }
    }
}
   /*


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode: ");
        int actualPin = input.nextInt();
        System.out.println("Please enter the last 4 digits of your ssn");
        int actualSSN = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;
        boolean validPin = actualPin == expectedPin;
        boolean validSSN = actualSSN == expectedSSN;

        if( validPin && validSSN ){
            System.out.println("Authentication successful");
        } else {

            System.out.println("Authentication failed");

            if(!validPin){
                System.out.println("incorrect pin code");
            }

            if(!validSSN){
                System.out.println("incorrect ssn");
            }

        }
         */
// valid pin: true -> !true -> false
// ssn wrong: false -> !false -> true