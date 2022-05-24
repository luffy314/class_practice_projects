package java.day09_scanner;
import java.util.Scanner;


public class WorkStatus {
    public static void main(String[] args) {

        Scanner status = new Scanner(System.in);

        System.out.println("first name");
        String firstName = status.next();
        System.out.println("firstName = " + firstName);

        System.out.println("last name");
        String lastName = status.next();
        System.out.println("lastName = " + lastName);

        System.out.println("Employed?");
        boolean employed = status.nextBoolean();
        System.out.println("employed = " + employed);

        System.out.println("student?");
        boolean student = status.nextBoolean();

        System.out.println("student = " + student);




    }
}
