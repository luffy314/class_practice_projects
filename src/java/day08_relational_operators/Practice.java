package java.day08_relational_operators;

public class Practice {

    public static void main(String[] args) {

        int M = 300;
        int N = 400;
        int U = ++M + N++ - M-- % 2 + --N % 2;


        System.out.println(M);
        System.out.println(N);
        System.out.println(U);
        System.out.println(301%2);
    }
}
