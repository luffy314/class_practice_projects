package practice_solutions.canvas;

import java.util.ArrayList;

/*

	create a class Canvas

		instance variables:
			- topic (String)
			- quizzes (ArrayList of Quiz objects)
			- modules (ArrayList of Module objects)

		constructor:
			- initialize topic
				-> create empty ArrayList objects for quizzes and modules
			- overload to accept the ArrayList of Quizzes and ArrayList of Module
				+ chain the constructors
 */
public class Canvas {

    String topic;
    ArrayList<Quiz> quizzes; // reference of ArrayList to hold Quiz objects
    ArrayList<Module> modules; //  // reference of ArrayList to hold Module objects

    public Canvas(String topic){
        this.topic = topic;
        quizzes = new ArrayList<>(); // creates an empty ArrayList object
        modules = new ArrayList<>(); // creates an empty ArrayList object
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this(topic);
        this.quizzes.addAll(quizzes); // adds the Quiz objects from the parameter List into the ArrayList object of Quiz objects
        this.modules.addAll(modules); // adds the Module objects from the parameter List into the ArrayList object of Module objects
    }

    @Override
    public String toString() {
        return "topic='" + topic + '\'' +
                ", \nquizzes=" + quizzes +
                ", \nmodules=" + modules;
    }
}
