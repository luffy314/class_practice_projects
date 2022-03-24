package day28_arrays;

public class MaxAndMin {
    public static void main(String[] args) {


        int[] num = {500, 120, -80, 90, 250, -10};
        int max = num[0];
        int min = num[0];
        for (int i = 0; i <= num.length - 1;i++) {
            if (num[i] > max) {
               max =  num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


        }

}
