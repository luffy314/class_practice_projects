package j.day32_arrays;

public class SameChar {
    public static void main(String[] args) {
        /*
        Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

				Input : "Anna", "Mike", "Aliya", "Donald", "Saim", "Remus", "Mehmet","Asya"

				Output :    4

			Small Task --> 	Find me the longest word at the same time  --> Donald

         */

        /*
        String first=names[i].substring(0,1);

       String last =names[i].substring(names[i].length-1);



         */

        String[] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        String longestOne="";

        int counter=0;

        for (int i = 0; i <names.length ; i++) {


            String first=names[i].substring(0,1);

            String last =names[i].substring(names[i].length()-1);

            if(first.equalsIgnoreCase(last)){
                if(names[i].length()>longestOne.length()){
                    longestOne=names[i];
                }
                counter++;
            }

        }

        System.out.println(counter);

        System.out.println("longestOne = " + longestOne);

    }
}
