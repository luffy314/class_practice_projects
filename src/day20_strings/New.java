package day20_strings;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String fN = email.substring(1, email.indexOf("_"));
        String lN = email.substring(email.indexOf("_")+2, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+2, email.indexOf("."));

        char cap1 = email.toUpperCase().charAt(0);
        char cap2 = email.toUpperCase().charAt(email.indexOf("_")+1);
        char cap3 = email.toUpperCase().charAt(email.indexOf("@")+1);

        System.out.print("First name: "+ cap1+fN +"\nLast name: "+cap2+ lN +"\nDomain: "+ cap3+domain);

    }
}
/*

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('_') + 2).toUpperCase()
                + email.substring(email.indexOf('_') + 2, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1, email.indexOf('@') + 2).toUpperCase()
                + email.substring(email.indexOf('@') + 2, email.indexOf('.'));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
    }
 */