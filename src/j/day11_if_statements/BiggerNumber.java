package j.day11_if_statements;

public class BiggerNumber {
    public static void main(String[] args) {

//        Create two number variables
//        Find and print which number is bigger between the two
//
//        ex:
//        50
//        45
//
//        output:
//        50 is bigger


        int x = 7;
        int y = 9;
        boolean greater = x>=y;

        if (greater){
            System.out.println(x + " is greater");
        }

        System.out.println(y + " is greater or they're equal");
    }
}
