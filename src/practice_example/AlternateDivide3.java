package practice_example;

public class AlternateDivide3 {
    public static void main(String[] args) {
        int one1 = 15;
        int two2 = 14;
        System.out.println(division(one1,two2));
    }

    public static int division(int dividing, int divider) {

        int count = 0;

        while (dividing >= divider) {
            dividing = dividing - divider;
            count++;

        }
        return count;
    }
}
