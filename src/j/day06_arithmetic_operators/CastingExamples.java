package j.day06_arithmetic_operators;

public class CastingExamples {

    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne;

        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short) num3;

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 30;
        System.out.println(num5);

        char letter = 'A';
        int letter2 = letter;

        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter);
        System.out.println((char)66);




    }



}
