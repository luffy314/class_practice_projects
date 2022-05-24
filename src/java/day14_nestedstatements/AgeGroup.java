package java.day14_nestedstatements;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age  = input.nextInt();
        String result = "";

        if(age <= 120 && age >= 0){
            if(age <= 2){
                result = "Baby (2 years and below)";
            } else if(age >= 3 && age <= 5){
                result = "Toddler (3 - 5)";
            } else if(age >= 6 && age <= 9){
                result = "Kid (6 - 9)";
            } else if(age >= 10 && age <= 12){
                result = "Pre-Teen (10 - 12)";
            } else if(age >=13 && age <= 17){
                result = "Teenager (13 - 17)";
            } else if(age >= 18 && age <= 20){
                result = "Young Adult (18 - 20)";
            } else if(age >= 21 && age <= 35){
                result = "Adult (21 - 35)";
            } else if(age >= 36 && age <= 55){
                result = "Middle-Aged Adult (36 - 55)";
            } else{
                result = "Senior Citizen (55+)";
            }
        } else{
            result = "Invalid age";
        }

        System.out.println("\n----------RESULT---------");
        System.out.println("Your age group is: " + result);
    }


}

//
//    declare and assign an age variable
//
//    use these ranges to determine which age group you belong to
//
//        if the given age value is less than 0 or more than 120:
//        print: Invalid age
//
//        otherwise uses these to determine the age group
//
//        Baby (2 years and below)
//        Toddler (3 - 5)
//        Kid (6 - 9
//        Pre-Teen (10 - 12)
//        Teenager (13 - 17)
//        Young Adult (18 - 20)
//        Adult (21 - 35)
//        Middle-Aged Adult (36 - 55)
//        Senior Citizen (55+)
//
