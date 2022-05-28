package j.day28_arrays;

public class ShortestLongest {
    public static void main(String[] args) {


        String[] array1 = {"Blue", "Yellow", "Red","Bi","aquamarine"};
        int longest = array1[0].length();
        int shortest =array1[0].length();
        String result1=array1[0];
        String result2=array1[0];

        for (int i = 1; i < array1.length; i++) {
            int length = array1[i].length();

            if (length>longest){
                result1=array1[i];
            }
            if (length<shortest){
                result2=array1[i];
            }

        }
        System.out.println("Longest: "+result1+"\nShortest: "+result2);

    }
}

/*
Shortest and Longest words from String array
 */