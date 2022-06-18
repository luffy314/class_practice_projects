package j.day64_functional_interface.homwork;

import java.util.*;
import java.util.function.Function;

public class FunctionFunctionalInterface {
    public static void main(String[] args) {

        //        1.1 Create a function that can return the sum of digits from a string that contains number digits-
        //     assuming that condition requires return sum of numbers which consists of digits
        Function<String, Integer> sumOfDigitsOfString = (str) ->
        { String number="0"; int sum=0;
            for (int i = 0; i <str.length() ; i++) {
                char letter=str.charAt(i);
                if(Character.isDigit(letter)){
                    number+=letter;
                }else{sum+=Integer.parseInt(number);
                    number="0";}}
            return sum+Integer.parseInt(number);};
//Checking created method
        String str= "123tyu45kkl9gh5";
        String str1="";
        System.out.println(sumOfDigitsOfString.apply(str));//182
        System.out.println(sumOfDigitsOfString.apply(str1));//0

//        1.2 Create a function that can convert a Set of Integers to List of Integers
        Function<Set<Integer>, List<Integer>> convertSetIntToListInt = (set) ->
        {List<Integer>list=new ArrayList<>(set);
            return list;};
//Checking created method
        Set<Integer>set=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(convertSetIntToListInt.apply(set));//[1, 2, 3, 4, 5, 6]


        //        1.3 Create a function that can return the reversed version of a String array - assuming that only elements order should be reversed according to the condition
        Function<String [], String[]> reverseStrArray = (strArr) ->{
            String [] reversed=new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                reversed[i]=strArr[strArr.length-1-i];}
            return reversed;};
//Checking created method
        String [] arr={"One","Two","Three","Four","Five"};
        System.out.println(Arrays.toString(reverseStrArray.apply(arr)));//[Five, Four, Three, Two, One]


    }
}
