package practice_example;

public class AlternateDivide2 {
    // Function to perform division `x/y` of two numbers `x` and `y` without
    // using the division operator in the code
    public static int divide(int x, int y)
    {
        // handle divisibility by 0
        if (y == 0)
        {
            System.out.println("Error!! Divisible by 0");
            System.exit(1);
        }

        // store sign of the result
        int sign = 1;
        if (x * y < 0) {
            sign = -1;
        }

        // convert both dividend and divisor to positive
        x = Math.abs(x);
        y = Math.abs(y);

        // initialize quotient by 0
        int quotient = 0;

        // loop till dividend `x` becomes less than divisor `y`
        while (x >= y)
        {
            x = x - y;      // perform a reduction on the dividend
            quotient++;     // increase quotient by 1
        }

        System.out.println("The remainder is " + x);
        return sign * quotient;
    }

    public static void main(String[] args)
    {
        int dividend = -100;
        int divisor = 25;


        System.out.println("The quotient is " + divide(dividend, divisor));

    }
}
/*
 int a=11;
        int b=2;
        int count=0;
        if(a>b) {
            for (int i = a; i >= b; i -= b) {
                count++;
                a -= b;
            }
        }
        System.out.println(a);
        System.out.println(count);
 */