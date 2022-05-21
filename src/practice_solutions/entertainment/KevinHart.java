package practice_solutions.entertainment;

/*
create a class KevinHart
-> KevinHart is a child of LiveShow

instance variables:
- performer (String)
- date (String format Ex: mm/dd/yyyy)

constructor:
- initialize name, company and location, performer, date
-> call super constructor

 */

public final class KevinHart extends LiveShow{

    String special;
    String date;

    public KevinHart(String location, String special, String date){
        super("Kevin Hart inc.", location); // the company is being assigned as Kevin Hart inc.
        this.special = special;
        this.date = date;
    }

}

/*
making the class final means it cannot be the parent of any other class

for example this would not compile:
class child extends KevinHart {}
*/