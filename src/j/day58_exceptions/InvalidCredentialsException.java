package j.day58_exceptions;

public class InvalidCredentialsException extends Exception{
    // this is a checked exception now because the parent is the Exception class

    public InvalidCredentialsException(String msg){
        super(msg);
    }


}
