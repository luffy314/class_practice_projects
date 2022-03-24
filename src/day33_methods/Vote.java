package day33_methods;

public class Vote {
    public static void eligibleToVote(int age){
        if(age>=18){
            System.out.println("can vote");
        }else{
            System.out.println("not eligible");
        }
    }

    public static void main(String[] args) {
        eligibleToVote(19);
    }
}
/*
create a method that will accept an age and determine if the person is
eligible to vote. Person must be 18 years or older to vote
 */