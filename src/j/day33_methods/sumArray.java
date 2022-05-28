package j.day33_methods;

public class sumArray {

    public static void arraySum(int[] num){
       int sum=0;
        for(int i=0; i<num.length;i++){
            sum +=num[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] six={1,2,3,4,5,6};
        arraySum(six);
    }


}


/*
Create a method that accept an int array. Take the sum of all the numbers
and print the result

 */