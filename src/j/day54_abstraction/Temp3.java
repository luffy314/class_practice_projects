package j.day54_abstraction;


import j.day58_exceptions.TempI;
import j.day53_abstraction.Temp2;

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

