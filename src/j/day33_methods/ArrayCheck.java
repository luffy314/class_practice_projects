package j.day33_methods;

public class ArrayCheck {
    public static void arrayCheck(int[] a,int num){
       boolean checkNum=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                checkNum=true;
                break;
            }
            }
        if(checkNum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        int check=4;
        arrayCheck(num,9);
    }

}
/*
Create a method that accepts an int array and a number. Check if the array
contains that number or not
Ex:
input: ( {1, 2, 3, 4}, 4 ) -> true
input: ( {1, 2, 3, 4}, 7 ) -> false
 */