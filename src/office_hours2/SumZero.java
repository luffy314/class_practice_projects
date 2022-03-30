package office_hours2;

import java.util.ArrayList;
import java.util.Random;

public class SumZero {

//        public static ArrayList<Integer> TaskThree(int n) {
//
//            ArrayList<Integer> list = new ArrayList<>();
//            int sum = 0;
//            int add = 0;
//            while (n-- > 1) {
//                sum += add;
//                list.add(add++);
//            }
//            sum = sum * -1;
//            list.add(sum);
//            return list;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(TaskThree(4));



    public static void main(String[] args) {
        System.out.println(uniqueArrayElements(5));
    }

    public static ArrayList<Integer> uniqueArrayElements(Integer N){

        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        int random = 0;
        int i = 0;

        if(N == 1){
            list.add(0);
        } else if(N == 2){
            random = rnd.nextInt(9);
            list.add(-random);
            list.add(random);
        } else {
            while (i < N - 1){
                random = rnd.nextInt(9);
                if (!list.contains(random)){
                    list.add(-random);
                    i++;
                }

                random = rnd.nextInt(9);
                while (!list.contains(random)){
                    list.add(random);
                    i++;
                }
            }

            i = 0;
            for (Integer integer : list) {
                i += integer;
            }

            list.add(-i);
        }

        return list;
    }
}
/*
Write a method that,
given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The method can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
 For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).

 */