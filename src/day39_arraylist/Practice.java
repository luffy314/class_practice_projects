package day39_arraylist;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(0,0);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        for(Integer elements : nums){
            System.out.println(elements);
        }
        System.out.println((int)'a');
    }
}
