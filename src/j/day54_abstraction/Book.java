package j.day54_abstraction;

public class Book implements Create, Boy{


    @Override
    public void fly() {
        Boy.super.fly();
    }

    @Override
    public void read() {
        System.out.println("Reading the book");
    }

    @Override
    public void write() {
        System.out.println("Writing the book");
    }
}
