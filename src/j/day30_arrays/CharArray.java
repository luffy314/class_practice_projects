package j.day30_arrays;

public class CharArray {
    public static void main(String[] args) {

        String sent="today is monday";
        String[] reverse = sent.split(" ");
        for(int i=reverse.length-1;i>=0;i--){
            System.out.println(reverse[i]);
        }





    }
}
