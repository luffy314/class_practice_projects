package java.day54_abstraction;


import java.day53_abstraction.Temp2;
import java.day58_exceptions.TempI;

public class Temp3 implements Temp2 {

        @Override
        public void mul(int a, int b)
        {
            System.out.print("Answer by Abstract method = ");
            System.out.println(a * b);
        }

        public static void main(String[] args)
        {
            Temp2 in = new Temp3();
            in.mul(2, 3);
            in.add(6, 2);
            TempI.mod(5, 3);
        }
    }

