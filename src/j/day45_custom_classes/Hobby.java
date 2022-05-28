package j.day45_custom_classes;

public class Hobby {
    String name;
    int annualCost;
    boolean isOutdoors;
    boolean social;

    public Hobby(String name){
        this.name=name;
    }

    public Hobby(String name, int annualCost){
        this(name);
        this.annualCost=annualCost;
    }

    public Hobby(String name, int annualCost, boolean isOutdoors, boolean social){
        this(name, annualCost);
        this.isOutdoors=isOutdoors;
        this.social=social;
    }

    public void doIt(){
        String output= "Doing "+ name + " "+ (isOutdoors?"outdoors":"indoors");
        System.out.println(output);
    }

    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + (isOutdoors?"outdoors":"indoors") +
                ", social=" + social +
                '}';
    }
}
/*
 create a class called Hobby

        - data:

            name, annual cost, is outdoors (boolean), requires others (boolean)

        - constructor

            - create a constructor that creates a Hobby object with the name

            - create a constructor that creates a Hobby object with the name and annual cost

            - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others

        - method:

            - doIt():
                print: Doing $name-of-hobby $outside-or-inside

            - toString()
                print all the Hobby information

    Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
 */