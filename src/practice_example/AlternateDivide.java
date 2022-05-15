package practice_example;

public class AlternateDivide {
    public static void main(String[] args) {
        altDivide(46,4);
    }

    //write a method that can divide two numbers without using the division operator

    public static void altDivide(double a, double b) {

        double remainder=Math.abs(a%b);         //mod can be negative values depending on value of a
        int quotient=0;
        int sign = 1;
        if (a * b < 0) {
            sign = -1;
        }

        if(b==0){
            System.out.println("Undefined, u can't divide by 0");
        }else if (a==0){
            System.out.println(0);
        }else if((a<0 && b<a)|| (a>0 && b>a)){
            System.out.println(a/b);
        }else if((a<0 && b>Math.abs(a)) || (a>0 && Math.abs(b)>a)){
            System.out.println(a/b);
        }else if((a>=b && b==1) || (b==-1 && (a>=b && a<0))){
            System.out.println(Math.abs(a));
        }else if(a>0 && b==-1) {
            System.out.println(-a);
        } else if (a < 0 && b == 1) {
            System.out.println(a);
        }else if(a == b){
            System.out.println(1);
        } else if ((Math.abs(a) == b && b > 0) || (a==Math.abs(b) && b<0)) {
            System.out.println(-1);
        }else {
            double y = Math.abs(a) - remainder;             //made a positive so that y is positive
            double x=0;
            for (int i = 1; i < y; i++) {
                x=Math.abs(b)*i;
                quotient++;
                if (x == y)
                    break;
            }
            double result=quotient+(remainder/(Math.abs(b)));

            System.out.println(a+ " divided by " + b + " = "+ result*sign);
        }


        }




    }



