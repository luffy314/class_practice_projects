package j.day05_variables;

public class RecapVariables {
    public static void main(String[] args) {

        //declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentsInClass;

      //  System.out.println(numberOfCoffeeCups);   //u need to assign values to them for them to show on console. also command button plus forward slash can be used to comment on a bunch of code and uncomment. turned the print statement into a comment at the end cause code below wouldn't run.


        //assigning values
        numberOfCoffeeCups=2;
        totalPriceOfCoffee=10.25;
        totalStudentsInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentsInClass);

        System.out.println(numberOfCoffeeCups + "  " + totalStudentsInClass);
        System.out.println(numberOfCoffeeCups + "\t" + totalStudentsInClass);//we used concatenation to print value of two variables at same time

        //declare and assign

        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("This is my temperature: " + temperature);
        System.out.println("it is day " + javaDays + " in my java class");






    }
}
