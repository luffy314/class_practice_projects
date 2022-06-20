package practice_example.test;

public class Parent2 {

    public Parent2(){
        System.out.println("Parent Constructor");
        init();
    }
    {
        System.out.println(
                "parent IIB"
        );
    }

    static {
        System.out.println("prints only once at beginning");
    }
    public void init(){
        System.out.println("parent Init()");
    }
}

class Child extends Parent2 {

    {
        System.out.println("child IIB");//IIB always before constructor
    }

    public Child(){
        super();
        System.out.println("Child Constructor");
    }


    private Integer attribute1;
    private Integer attribute2 = null;//both these get initiallized before constructor and between this and IBB, the one at the top of the class get's initalized first.




    public void init(){
        System.out.println("Child init()");
        super.init();
        attribute1 = new Integer(100);
        attribute2 = new Integer(200);
    }

    public void print(){
        System.out.println("attribute 1 : " +attribute1);
        System.out.println("attribute 2 : " +attribute2);
    }
}

 class Tester {

    public static void main(String[] args) {
        Parent2 c = new Child();
        ((Child) c).print();

        System.out.println("----");
        Parent2 d= new Parent2();
//        ((Child)d).print(); not possible to cast to child when method doesn't exist in parent class

        System.out.println("----");

        Child e=new Child();
        e.print();
//        ((Parent2)e).print();  not possible if method doesn't exist in parent, compile error

    }
}
