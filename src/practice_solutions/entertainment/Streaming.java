package practice_solutions.entertainment;

/*
create a class Streaming
-> Streaming is a child of Entertainment

instance variables:
- duration (double)

constructor:
- initialize name, company, and duration
-> call super constructor
-> hint: name value will be 'Streaming' for all subclasses

 */

public class Streaming extends Entertainment {

    double duration;

    public Streaming(String company, double duration){
        super("Streaming", company); // sets Streaming as the name of the Entertainment
        this.duration = duration;
    }

}


