package j.day50_inheritance.book;

public class EBook extends Book{

    double size;
    int pages;

    public void read(){
        System.out.println("Reading a digital copy of " + title);
    }}
