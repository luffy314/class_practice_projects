package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples=50;
        int grapes=100;
        int bananas=150;

        System.out.println("this is how many apples we have: "+    apples);
        System.out.println("grapes: " + grapes);
        System.out.println("bananas: " + bananas);

        System.out.println(apples+grapes+bananas);

        System.out.println("sold some apples");
        apples = 25;    //can't declare the same variable twice, can only reassign
        System.out.println("Apples after selling: " + apples);

        int price = 20;

        System.out.println("the price of my " + apples + " apples is $" + price);


    }
}
