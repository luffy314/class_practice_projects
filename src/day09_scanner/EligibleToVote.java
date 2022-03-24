package day09_scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "john";
        boolean citizen = true;
        boolean criminal = false;
        int age = 18;

        boolean eligibleToVote = age >=18 && citizen && (!criminal);

        System.out.println(name + " is eligibleToVote = " + eligibleToVote);




    }
}
