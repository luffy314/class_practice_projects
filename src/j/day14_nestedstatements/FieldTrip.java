package j.day14_nestedstatements;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your grade? ");
        int grade = input.nextInt();
        String location = "", teacherInCharge = "";
        int numberOfGroups = 0;

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie theater";
                numberOfGroups = 2;
                teacherInCharge = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Lela";
            } else {
                location = "Six Flags";
                numberOfGroups = 8;
                teacherInCharge = "Mr. Watt";
            }
        } else {
            System.out.println("Grade must be between 1-6");
        }

        System.out.println("\n----------RESULT----------");
        System.out.println("Data based on your grade: \n\nlocation:\t\t\t " + location + "\nnumberOfGroups:\t\t " + numberOfGroups + "\nteacher In Charge:\t " + teacherInCharge);
    }
}
//        ------------------------------------------------------------------------
//
//        Create a class called FieldTrip.
//        Your school goes on a Field trip each year. The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip. Print the information at the end.
//
//        declare and assign the grade level variable
//
//        only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
//        so print: "Grade must be between 1-6"
//
//        Data based on grade:
//        grade - 1
//        location -  Apple orchard
//        number of groups - 3
//        teacher in charge - Ms. Smith
//
//        grade - 2
//        location - Zoo
//        number of groups - 7
//        teacher in charge - Mr. Lee
//
//        grade - 3
//        location - Aquarium
//        number of groups - 5
//        teacher in charge - Ms. Wilson
//
//        grade - 4
//        location - Movie theater
//        number of groups - 2
//        teacher in charge - Ms. Reyes
//
//        grade - 5
//        location - Museum
//        number of groups - 5
//        teacher in charge - Ms. Lela
//
//        grade - 6
//        location - Six Flags
//        number of groups - 8
//        teacher in charge - Mr. Watt
