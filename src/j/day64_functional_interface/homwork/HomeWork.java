package j.day64_functional_interface.homwork;

import j.day54_abstraction.Create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HomeWork {
    public static void main(String[] args) {

  /*
        Use ListFunction functional interface to:
		1.1 Create a function that can return the maximum number from a list of Integer

		1.2 Create a function that can return the minimum number from a list of Integer

		1.3 Create a function that can return the longest String from a List of String

		1.4 Create a function that can return the shortest String from a List of String

		1.5 Create a function that can convert List of integer to int array

		1.6 Create a function that can convert List of double to double array
         */


        ListFunction<Integer, Integer> maxNumber= numbers->{

            Integer max=Integer.MIN_VALUE;

            for(Integer each:numbers){
                if(each>max){
                    max=each;
                }

            }

            return max;
        };

        List<Integer> list=new ArrayList<>(Arrays.asList(32,5,12,5,1232,-10));

        Integer maximumNumber=maxNumber.apply(list);
        System.out.println(maximumNumber);

        System.out.println("----------------------------------");

//        1.2 Create a function that can return the minimum number from a list of Integer

        ListFunction<Integer, Integer> minNumber= numbers->{

            Integer min=Integer.MAX_VALUE;

            for(Integer each:numbers){
                if(each<min){
                    min=each;
                }

            }

            return min;
        };

        Integer minimumNumber=minNumber.apply(list);
        System.out.println(minimumNumber);

        System.out.println("----------------------------------");

//        1.3 Create a function that can return the longest String from a List of String

        ListFunction<String,String> longestString=(str)->{

            String longest="";
            for(String each:str){

                if(each.length()>longest.length()){
                    longest=each;
                }
            }
            return longest;
        };

        List<String> list2=new ArrayList<>(Arrays.asList("java","selenium","collections"));

        String longStr=longestString.apply(list2);
        System.out.println(longStr);

        System.out.println("----------------------------------");

//        1.4 Create a function that can return the shortest String from a List of String


        ListFunction<String,String> shortestString=(str)->{

            String shortest= str.get(0);
            for(String each:str){

                if(each.length()<shortest.length()){
                    shortest=each;
                }
            }
            return shortest;
        };

        String shortStr=shortestString.apply(list2);
        System.out.println(shortStr);

        System.out.println("----------------------------------");

//        1.5 Create a function that can convert List of integer to int array


        ListFunction<Integer,int []> storeIntArray= (nums)->{

            int [] arr=new int[nums.size()];
            for(int i=0;i<nums.size();i++){
                arr[i]=nums.get(i);
            }
            return arr;
        };

        List<Integer> list3=new ArrayList<>(Arrays.asList(32,5,12,5,8));

        int [] arr2=storeIntArray.apply(list3);

        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------------------");

//        1.6 Create a function that can convert List of double to double array


        ListFunction<Double,double[]> storeDoubleArray= (nums)->{

            double [] arr=new double[nums.size()];
            for(int i=0;i<nums.size();i++){
                arr[i]=nums.get(i);
            }
            return arr;
        };

        List< Double> list4=new ArrayList<>(Arrays.asList(2.5,5.8,1.0,8.2));

        double [] arr3=storeDoubleArray.apply(list4);

        System.out.println(Arrays.toString(arr3));




    }



    }

