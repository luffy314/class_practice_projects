package office_hours.day4;

import java.util.ArrayList;

public class Contains {
    public static void main(String[] args) {
        /*
    Write a method that accepts an array and returns true if it contains 2 or 3
int[] x = {2,5,4,6,8,9}; = > true
int[] y = {4,3,0,100,55}; = > true
int[] z = {4,5,1,5,6}; = > false
     */
        int[]arr = {4,5,1,5,6,3};
        System.out.println(contains(arr));


    }
    public static boolean contains(int[] array){
        for (int each : array) {
            if(each == 2 || each==3){
                return true; //stops the execution
            }
        }
        return false;
    }

    public static boolean contains(ArrayList<Integer> list){ //method overloading

        if(list.contains(2)||list.contains(3)){ //autoboxig
            return true;
        }
        return false;
    }
}
