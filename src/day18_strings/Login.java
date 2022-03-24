package day18_strings;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter username, lowercase");
        String username = input.next();

        System.out.println("enter password");
        String password = input.next();

        username = username.toLowerCase();
        System.out.println(username);

        if(password.length() >= 8 && password.equals("jamesbond")){
            System.out.println("Logged in with " + username);

        }else{
            System.out.println("invalid password");
        }



    }
}
