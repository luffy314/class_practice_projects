package practice_example.practice;

public class Practice4 {
    /*
 Task 1 : Please implement this method to return the sum of all integers found in the parameter String.

                 String s="jav45ai1000sgre1at82"
                  result: 45+1000+1+82 ----> 1128
  */
    public static void main(String[] args) {
        String s="jav45ai1000sgre1at82";
        System.out.println(sumOfAllIntegers(s));

    }

    public static int sumOfAllIntegers(String str){

        int sum = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
            } else {
                if(!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if(!temp.isEmpty()){
            sum += Integer.parseInt(temp);
        }

        return sum;
    }
}



                





