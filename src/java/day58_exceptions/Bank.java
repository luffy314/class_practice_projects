package java.day58_exceptions;

public class Bank {
    double balance;

    public void withdraw(double amountToTakeOut){

        if(amountToTakeOut > balance){
            throw new NotEnoughMoneyException("Balance only has " + balance);
        }

        balance -= amountToTakeOut;

    }

    public void login(String username, String password) throws InvalidCredentialsException{

        if(!username.equals("jamesbond")){
            throw new InvalidCredentialsException("Invalid username");
        }

        if(!password.equals("007")){
            throw new InvalidCredentialsException("Invalid password");
        }

        System.out.println("LOGIN");

    }

}


/*
        if(amountToTakeOut > balance){
            NotEnoughMoneyException e = new NotEnoughMoneyException();
            throw e;
        }
 */

