package j.day58_exceptions;


public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(String s){
        super("Not enough money in the account");
    }

}
