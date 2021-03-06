package other2;

// A Simple Java program to demonstrate
// Overriding and Access-Modifiers

public class Parent {
    // private methods are not overridden
    private void m1() {
        System.out.println("From parent m1()");
    }


    protected void m2() {
        System.out.println("From parent m2()");
    }

    public void fly(int a) {
        System.out.println("parent fly");
    }

    int fly(int a, int b) {//overloaded and changed both access modifier and return type by using different parameters
        return 5;
    }

    void surf() {
        System.out.println("parent surf");
    }

    protected Object test(String one) {//here and also class inside interface
        System.out.println("parent test");
        return null;
    }

    ;

//    public void twice(){
//        System.out.println("parent");
//    }

    public static void once() {
        System.out.println("parent class");
    }



}

class Child extends Parent {


    int q=744;
    int x=10;
    static int y=40;
    // new m1() method
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {

        System.out.println("From child m2()");

    }
    {
        x=88;
        int x=67;
//        this.x=55; works inside IBB
        x=49;
    }


    public static void once(){
//        x=2;  not allowed, compile error, non static field in static method
        int x=5;//treated as local variable
        System.out.println(x);
        y=20;//changes static field
        int y=99;//treated as local variable
        System.out.println(y); //local variables take prioroity over static fields
    }

    public void twice(){
        x=3;
        int x=44;//local variable created
        System.out.println(x);//lcoal variable has power inside methods
        y=89;
        int y=69;
        System.out.println(y);

    }
    //can't have covariant parameters because of liskov principle
//    @Override  compile error
    public String test(String one){//here and also class inside interface
        System.out.println("parent test");
        return "it works";
    };//return type covariant, parameter type invariant
}

//class Baby extends Child{
//    @Override
//    void m2() { doesn't work, access modifier during overriding must be equal or greater no matter what
//        System.out.println("baby");
//    }
//}

// Driver class
class Main {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
        Child three=new Child();
        three.once();
        three.twice();
//        ((obj2)obj1).twice(); //doesn't work if method doesn't exist in parent class
//        obj2.twice();   doesn't ework if method isn't in parent class as well
        ((Child) obj2).twice();//works prints 69
//        System.out.println(((Parent)three).x); doesn't work if parent doesn't have value eve if u cast

        obj2.surf();
        System.out.println("----------");
        obj1.fly(3);

        String q="child class works for differetn return types";
        System.out.println("mmmmmmmmmmmmmmmm");
//        obj1.test(new Object());
        three.test(q);//can't have covariant parameters because of liskov principle

//        ((Child)obj1).twice();//creates class cast exception

//        ((Parent)three).twice(); //when u cast to parent class, runtime poly happpens and the child method will print again.

        three.once();
        ((Parent)three).once();//printed parent static method
//        ((Child)Parent).once(); gives compiel error either way
        Child.once();//child class inherits and can use parent static method when childs doesn't exist. can't cast using parent and child class anmes on each other.
//        ((Parent)Child).once();//nope compiler error even when i comment out child static method

        System.out.println("eeeeeeeeeee");
        ((Child)obj2).once();


//            int x = 5;
//            {
//                int x = 10; not allowed x won't print
//                System.out.println(x);
//            }
//        }

        int x=5;
        for (x = 0; x < 4; x++)
        {
            System.out.println(x);
        }

        System.out.println(x);



    }
    }

interface T{

    void shine();

    public class tom{
        static {

        }

    }
}

abstract class U implements T{

    public void shine(){
        System.out.println("shhot");
    }

}


