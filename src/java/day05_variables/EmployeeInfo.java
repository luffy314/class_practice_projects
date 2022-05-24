package java.day05_variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Ali";
        String lastName = "Fattahi";
        char gender = 'M';
        int age = 29;
        String companyName = "google";
        boolean fullTime = true;
        String jobTitle = "SDET";
        int salary = 120000;
        int numberOfPTO = 20;
        boolean married = false;
        char suite = 'A';


        System.out.println("i'm a " + age + gender + " by the name of " + firstName + lastName);
        System.out.println("i work at " + companyName + fullTime + " as a " + jobTitle + " and i'm paid" + salary + " every year and right now i have" + numberOfPTO + " days of PTO");
        System.out.println("i live in suite " + suite);

        String fullMessage = "i'm a " + age + gender + " by the name of " + firstName + lastName +"." +  " i work at " + companyName + fullTime + " as a " + jobTitle + " and i'm paid" + salary + " every year and right now i have" + numberOfPTO + " days of PTO. " +  " i live in suite " + suite;

        System.out.println(fullMessage);
    }
}
