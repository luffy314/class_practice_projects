package practice_solutions.canvas;

import java.util.ArrayList;

/*
create a class Module
instance variables:

- files (ArrayList of File objects)

constructor:
- no parameter -> create empty ArrayList object
- initialize with given ArrayList of Files
-> Use chaining

methods:
- toString: print all the quiz information
- addFile(File): accept a File object and add the given File to the ArrayList
of Files of that module
- removeFile(File): accepts a File object and remove the given File from the ArrayList of Files of that module
 */

public class Module {

    ArrayList<File> files; // reference for an ArrayList that holds File objects, remember File is the class we made, so objects of that class can be stored into this collection

    public Module(){
        this.files = new ArrayList<>(); //  if you don't have this line the files is just a reference with no object, so if the user calls the no argument constructor we make sure it will create an ArrayList object to be used
    }

    public Module(ArrayList<File> files){
        this(); // makes sures to call the no argument constructor which is creating the ArrayList object
        this.files.addAll(files); // addAll method is adding all the files from the parameter into the instance variable object
    }

    public void addFile(File file){
        files.add(file);
    }

    public void removeFile(File file){
        files.remove(file);
    }

    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }
}


