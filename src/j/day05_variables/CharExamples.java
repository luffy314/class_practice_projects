package j.day05_variables;

public class CharExamples {

    public static void main(String[] args) {

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';
        char numberFour = '8';



        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);
        System.out.println(numberFour);

        char letterThree = 65;  //char letterThree = 'A', char also only takes one character
        char letterFour = 66;
        char letterFive = 7;
        letterFive = 'g';
        char numberSeven = 6;  //prints a blank space



        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);
        System.out.println(numberSeven);

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne);  //turns letter into ascii values and adds them

        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne + " " +specialOne);  //space between each character

        System.out.println("chars: " + letterOne + letterTwo + letterThree + numberOne + specialOne);
        //a string in the beginning
    }



}
