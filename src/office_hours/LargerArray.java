package office_hours;

public class LargerArray {
    public static void stringTimes(String a,int b){
        if(b>=0) {
            for (int j = 1; j <= b; j++) {
                System.out.print(a);
                }

        }

        }



    public static void main(String[] args) {
        stringTimes("help", 5);
    }

}

/*
 Task 1 :    Write a method that accepts a string and a non-negative number,
            	and prints a larger string that is number copies of the original String

                stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi


	Task 2 :   Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    Task 3 :    Write a method that can remove  all extra space from String


    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java

	Task 4 :   Write a method that can check if a number is Armstrong number

				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.


                print all the armstrong numbers with three digit
				Armstrong numbers are     === 153 370 371 407 === for 3 digits

				 153   ==  (1*1*1)+(5*5*5)+(3*3*3)
                             1       125      27  == 153




    Task 5 :     Number of Steps to Main directory  --- Interview Task

    			 We have a record of every time a change of directory is performed.The different change directory functions are as follow ;

    				 ../  Move to parent folder of current folder
    				 ./   Remain in the same folder
    				 x/   Move to the child folder named x


    				 Write a method to Find the minimum steps required to go back to main directory from current folder.The squence of operations performed after entering the main directory provided


    				 Input : {"x/","y/","../","z/","./"}

    				 Output : 2







 */