package day18_strings;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        String accountNum = input.nextLine().trim();
        String result = "";

        if(accountNum.isEmpty()){
            result = "Empty input given";
        } else if(accountNum.length() == 7){
            if(accountNum.startsWith("2")){
                result = "Valid 7-digit account number";
            } else{
                result = "Invalid 7-digit account number";
            }
        } else if(accountNum.length() == 10){
            if(accountNum.startsWith("5")){
                result = "Valid 10-digit account number";
            } else {
                result = "Invalid 10-digit account number";
            }
        } else{
            result = "Invalid account number";
        }

        System.out.println("\n---------RESULT---------");
        System.out.println(result);
    }
    }



//    create a class AccountNumber
//ask the user enter an account number and check if the account number is valid. Accounts are valid if:
//        handle empty inputs. If there is an empty input, do not check anything else and print: "Empty input given"
//
//        - If the account number begins with a "2" the account number should be 7 characters long
//        Print: "Valid 7-digit account number"
//        Otherwise: "Invalid 7-digit account number"
//
//        - If the account number begins with a "5" the account number should be 10 characters long
//        Print: "Valid 5-digit account number"
//        Otherwise: "Invalid 5-digit account number"
//
//        — If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”
//
//        -----------------------------------------------------------------
//
