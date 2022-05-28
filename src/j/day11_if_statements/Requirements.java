package j.day11_if_statements;

public class Requirements {
    public static void main(String[] args) {

        double accountValue = 100;
        double withdraw = 150;

        if (withdraw <=100){
            System.out.println("balance: " + (accountValue-withdraw));

        }else {
            System.out.println("overdraft " + (accountValue-withdraw -100));
        }





    }
}
