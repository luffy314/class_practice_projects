package leetcode;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] test={-1,0,1,3,1,-4};
        threeSum(test);
        String s="help";

    }

    public static void threeSum(int[] nums){
        int[] result=new int[3];
        for (int i=0;i< nums.length-2;i++){
            int a=nums[i];
            for(int j=1;j<nums.length-1;j++){
                int b=nums[j];
                if(b==a){
                    continue;
                }
                for (int k = 2; k <nums.length ; k++) {
                    int c=nums[k];
                    if(c==a || c==b){
                        continue;
                    }
                    if(a+b+c==0){
                        result[0]=a;
                        result[1]=b;
                        result[2]=c;
                        i++;
                        break;
                    }
                }System.out.println(Arrays.toString(result));
            }
        }

    }
}
//couldn't finish it

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:

Input: nums = []
Output: []

Example 3:

Input: nums = [0]
Output: []



Constraints:

    0 <= nums.length <= 3000
    -105 <= nums[i] <= 105


 */