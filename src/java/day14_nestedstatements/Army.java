package java.day14_nestedstatements;

import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("are u a citizen? t/f");
        boolean citizen = input.nextBoolean();

        System.out.println("are u a resident? t/f");
        boolean resident = input.nextBoolean();

        System.out.println("do u have a high school diploma? t/f");
        boolean highSchool = input.nextBoolean();

        System.out.println("how old are u");
        int age = input.nextInt();

        String message;

        if(citizen==true || resident==true){
            if(age>=18 && age<=35){
                if(highSchool==true){
                    message="u are qualified for the army";

                }else{
                    message="u need a diploma";
                }

            }else{
                message="you age must be between 18 to 35";
            }


        }else{
            message= "you must be a citizen or resident";

        }

        System.out.println(message);




    }
}
//        ------------------------------------------------------------------------
//
//        Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.
//
//        - The person must be a citizen or a resident
//        -> If not print: You must be a citizen or a resident
//        - Their age must be between 18 and 35
//        -> If not print: Your age must be between 18 to 35 years old
//        - They must have a high school diploma
//        -> If not print: You must have a high school diploma
//
//        > If all the criteria is met print: You are qualified for the Army
//
