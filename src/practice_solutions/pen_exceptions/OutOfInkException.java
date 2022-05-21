package practice_solutions.pen_exceptions;

public class OutOfInkException extends RuntimeException{

    public OutOfInkException(String message) {
        super(message);
    }
}

// Creating a class as a sub class of the RuntimeException class will create an unchecked exception
