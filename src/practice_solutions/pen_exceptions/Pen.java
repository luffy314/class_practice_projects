package practice_solutions.pen_exceptions;

public class Pen {

    int inkLevel;
    String inkColor;

    /**
     * write method will print a message about using the pen and subtract 10 from the ink level variable
     * @throws OutOfInkException if the ink level variables be below 10
     * OutOfInkException is an unchecked exception so nothing needs to be handled here, it will be thrown during runtime
     */
    public void write(){

        if(inkLevel < 10){
            throw new OutOfInkException("Ink Below 10%"); // throw keyword is how exceptions occur
        }

        System.out.println("Writing with pen, 10% ink used");
        inkLevel -= 10;

    }

    /**
     * changeColor method will change the ink color variable to the given parameter color, if the given color is a valid color
     * Valid colors are: black, red, or blue
     * @throws InvalidColorException if the given color is not a valid color
     * InvalidColorException is a checked exception so it must be handled, but I do not have to handle it, the user of this method should handle.
     * I used throws to ignore the exception and pass the exception to where this method is called
     */
    public void changeColor(String color) throws InvalidColorException{

        if(color.equals("black") || color.equals("red") || color.equals("blue")){
            this.inkColor = color;
        } else {
            throw new InvalidColorException(color + " is not a valid color");
        }

    }

}
