package j.day56_polymorphism;

/*
Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
 */
public abstract class EBook extends Book implements Downloadable{

    double size;

    public abstract void read();

    public abstract void download();

    public abstract void open();

}