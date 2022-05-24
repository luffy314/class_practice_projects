package java.day16_Review;

public class Practice {
    public static void main(String[] args) {


        int number = 30;
        String result = "";


        if (number % 2 == 0) {
            result += "Codility";
            //System.out.print("Codility");
        }

        if (number % 3 == 0) {
            result += "Test";
            //System.out.print("Test");
        }

        if (number % 5 == 0) {
            result += "Coders";
            //System.out.print("Coders");
        }

        System.out.println("result = " + result);


//         with multi branch if but this is inocrrect since it it will display the first correct result

        if (number % 2 == 0) {
            result = "Codility";
        } else if (number % 3 == 0) {
            result = "Test";
        } else if (number % 5 == 0) {
            result = "Coders";
        } else if (number % 2 == 0 && number % 3 == 0) {
            result = "CodilityTest";

        } else if (number % 2 == 0 && number % 5 == 0) {
            result = "CodilityCoders";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "TestCoders";
        } else if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
            result = "CodilityTestCoders";
        }
        System.out.println(result);
    }
}
