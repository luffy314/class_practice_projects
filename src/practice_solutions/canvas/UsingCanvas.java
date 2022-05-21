package practice_solutions.canvas;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingCanvas {
    public static void main(String[] args) {

        /*
        This is the runner class for the Canvas objects in combination with all the other classes/object created for this idea and practice
         */

        Canvas javaCourse = new Canvas("Java");

        Quiz variables = new Quiz("variables", 10, 10);
        javaCourse.quizzes.add(variables);
        javaCourse.quizzes.add(new Quiz("if statement", 8, 12));
        // above we created Quiz objects in two different ways. The first one(line 12) made a reference in the main method and was then added to the ArrayList of Quizzes
        // then the second Quiz object was made directly as the argument to the add method of the ArrayList

        // Below is creating File object, ArrayList of Files, and Module objects one step at a time in order to add to the canvas course object
        File day1Notes = new File("day1Notes", 1.2);
        File day1Pdf = new File("Day 1.pdf", 2.4);

        ArrayList<File> files = new ArrayList<>();
        files.add(day1Notes);
        files.add(day1Pdf);

        Module day1Module = new Module(files);
        javaCourse.modules.add(day1Module);

        // Here we did the same as above, to add modules to the canvas object, but more in one step instead of separate steps

        javaCourse.modules.add(new Module(new ArrayList<>(Arrays.asList(
                new File("day 2 notes", 1.5),
                new File("day 2 recap pdf", 2.4)
        ))
        ));

        System.out.println(javaCourse); // prints the whole canvas object

    }
}
