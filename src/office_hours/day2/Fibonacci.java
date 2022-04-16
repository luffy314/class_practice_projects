package office_hours.day2;

import java.util.Arrays;

public class Fibonacci {
//    public static int[] fibonacci(int a) {
//        //because the given number will be the index ,to get to the array length we need to add 1
//        int[] fibornaci = new int[a+1];
//        fibornaci[0] = 0;
//        if (a == 0) {
//            return fibornaci;
//        }
//        fibornaci[1] = 1;
//        for (int i = 2; i < fibornaci.length; i++) {
//            fibornaci[i] = fibornaci[i - 2] + fibornaci[i - 1];
//        }
//        return fibornaci;
//    }
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(fibonacci(1)));
//        System.out.println(Arrays.toString(fibonacci(5)));
//        System.out.println(Arrays.toString(fibonacci(10)));
//        System.out.println(Arrays.toString(fibonacci(7)));
//}
    public static void main(String[] args) {
        fibo(4);
    }

//    public static ArrayList<Integer> createFibonacciNumbers(int n){
//
//        ArrayList <Integer> list = new ArrayList<>();
//
//
//        if(n >= 1){
//            list.add(0);
//            list.add(1);
//
//            for (int i = 2; i <= n; i++) {
//                list.add(list.get(i - 2) + list.get(i - 1));
//            }
//        } else if(n == 0){
//            list.add(0);
//        }
//
//        return list;
//    }
    public static void fibo(int number){



        // Array solution

        int[] fibo=new int[number+1];

        //System.out.println(fibo[8]);


        fibo[0]=0;
        fibo[1]=1;

        for (int i = 2; i < fibo.length; i++) {


            fibo[i]=fibo[i-1]+fibo[i-2];

        }


        System.out.println(Arrays.toString(fibo));


    }


}
