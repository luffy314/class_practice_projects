package practice_solutions.entertainment;

/*
create a class LiveShow

-> LiveShow is a child of Entertainment
instance variables:
- location (String)

constructor:
- initialize name, company, and location
-> call super constructor

-> hint: name value will be 'Live Show' for all subclasses
 */

public class LiveShow extends Entertainment {

    String location;

    public LiveShow(String company, String location){
        super("Live Show", company); // the name variable will be assigned Live Show
        this.location = location;
    }

}

