package practice_solutions.pen_exceptions;

public class Runner {
    public static void main(String[] args) {

        // First case is a valid case:

        Pen pen = new Pen();
        pen.inkLevel = 100;
        pen.inkColor = "red";

        pen.write(); // unchecked exception out occur

        try {
            pen.changeColor("blue"); // checked exception is thrown, so it must be handled, even if a valid value is given
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        // Second case is the invalid cases, comment the different methods to see both results

        Pen pen2 = new Pen();
        pen2.inkLevel = 9;
        pen2.inkColor = "red";


        pen2.write(); // unchecked exception could occur

//        try {
//            pen2.write(); // unchecked exception could occur
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        try {
            pen2.changeColor("green"); // checked exception is thrown, so it must be handled, even if a valid value is given
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

    }
}
