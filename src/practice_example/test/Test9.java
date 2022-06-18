package practice_example.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Test9 {


    //    Test9 once=new Test9();  //can create an instance variable of the same class inside class but will cause a stackoverflow error cause infinte loop call
    int a = 5;  // instance variables can only be used by same classes object, can bec called through super in constructor
    static int y = 9;  //can be called by child class with no issues unless child class has same static variable then this will be hidden by child class
    final static int z = 3;

    final int l=8;


    final static void print() {   //final static methods can be inherited and used but can't be overidden or hidden. normal static methods can only be hidden.
        System.out.println("parent");
    }

    static void Test9() {
        System.out.println("eat");
    }

    void eat() {
        System.out.println("cake");
    }

    void sleep() {
        System.out.println("sleep");
    }
    final void kill(){
        System.out.println("killlllll");
    }
}

class b extends Test9 {
    //    static void print(){       //will cause compiler issue if same static method in parent is final
//        System.out.println("child");
//    }
    int a = 66;
    static int y = 12;  //once this is created, child class will call this instead of parent variable

    final static int z = 15;

    final int l=17;//once this is created, the parent varaible will be hidden

    static void Test9() {
        System.out.println("child eat");
    }

    void eat() {
        System.out.println("child cake");
    }

    int f = 4444;
    static int g = 44;

    void poop() {
        System.out.println("poopppp insde child class");
    }

    static void call() {
        System.out.println("call inside child");
    }

//    final void kill(){   gives compile error cause final instance can't override from parent method
//        System.out.println("killlllll");
//    }

    public static void main(String[] args) {
        b c = new b();

        c.print();  //can't cast to parent method or to child for any static methods
        b.print();
        Test9.print();
        print();

        b.Test9();
        Test9.Test9();
        c.Test9();
        Test9();

//        System.out.println(b.a);  parent class instance variable can't be called by a class
        System.out.println(c.a);  //object of child class can call parent class instance variables
//        System.out.println(Test9.a); doesn't work as well

        System.out.println(c.y);   //can't cast to parent or child classes for statice variable
        System.out.println(b.y);
        System.out.println(y);
        System.out.println(Test9.y);

        System.out.println(c.z);   //parent final static variable can be called by everything unless child class has same final static varaible then child class will call child varaible
        System.out.println(b.z);
        System.out.println(z);
        System.out.println(Test9.z);


//u can have final static variables in both parent and child but not final static methods/compiler error


        c.eat();
//        b.eat();  classes can't call instance methods but really cause it's also inside static method
//        eat(); // instance method cann't be called from static context/method
//        Test9.eat();


        Test9 link = new b();//polymorphism for all variables

        System.out.println(link.a);
        System.out.println(link.y);
        System.out.println(link.z);
        link.print();
        link.Test9();
        System.out.println(((b) link).f);
        link.eat();//instance methods are only time runtime polymorphism occurs meaning line 82 link will call the child instance method over parent method, but for everything else if both parent and child have it, then the parent class will always be called. u can cast to child though to child class, cause if child class has a

        System.out.println(((b) link).f); //is using polymrophism, parent calss always chooses parent instance variable over child one, and u have to cast to child class for any unique child variables otherwise won't compile

        System.out.println(((b) link).g);  //same for static variables as above rule, u have to cast

        ((b) link).poop();  //if parent class doesn't have same instance method, u have to cast it to child class to compile, but if they both have it then runtime polymorphism occurs and child instance method pirnts over paretn class unless u cast to parent classs

        ((b) link).call();  //same for static methods in only child class, u have to cast

        //when using polymorphism, parent class methods and variables will always take priority excetp for child instance methods that take priority over the same parent ones. u have to cast to child class methods and variables for them to take print over the same parent ones. parent class takes prioirty except for instance mthods. u can cast from parent class methods or variables to child or back and forth but u have ot do the parenthesis correctly as shown belown

        link.eat();//child class
        (link).eat();

        System.out.println(((b) link).a);
        ((b) link).Test9();
        System.out.println(((b) link).y);//accessed the child static varaible by casting
        System.out.println((link).y);

        System.out.println(link.z);
        System.out.println(((b) link).z);  //final static variables can be cast to child

        link.eat();//the overriden method will always print, can't cast as well

        link.sleep();//prints parent instance method becausse child class didn't override it

        link.kill();  //final instance mthods just like final static methods can't be overridden, will give compile error
    }

}
