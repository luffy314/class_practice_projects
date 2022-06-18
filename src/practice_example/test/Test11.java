package practice_example.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test11 {

    void read() {
        System.out.println("read");
    }

    public static void eat() {
        System.out.println("eat");
    }

    static void money() {
        System.out.println("make money parent");
    }

    public static void main(String[] args) {
        eat();
        Test11.eat();


    }
}

class win extends Test11 {

    void read() {
        System.out.println("child read");
    }

    void run() {
        System.out.println("run");
    }

    public static void fear() {
        System.out.println("fear chld");
    }

    static void money() {
        System.out.println("make money child");
    }

    public static void main(String[] args) {
//        ((win)Test11).fear();  compile error
        Test11.eat();
//            ((Test11)win).money();  won't woork, compiler error
        win.fear();
        win.eat();
        win.money();

        Test11 two = new Test11();
        ((win) two).fear();//used parent class object to access child class static method
        ((win) two).money();
//        ((win)two).read();//casting to child instance mthod from parent object cause class cast exception
//        ((win)two).run();


        Test11.eat();
//            ((win)Test11).fear();//doesn't work
        Test11 one = new Test11();
//            ((Test11)one).run(); //doesn't work, doesn't have the method in class body
        ((Test11) one).money();
        one.read();//access parent instanc emethod before overriding the method
        ((Test11) one).money();

//        win four = new Test11();   compile error

//child class can access parent static methods but not instance methods and will print them. if child class has the same static method as the one inherited from parent, only child static method will print using the child class name, u can't upcast it. child class object can upcast and access parent static method and parent instance method. parent class object can downcast and access child static method but can't access child instance methods.

    }

}
/* child c= new child();
Child class can access parent static methods but not instance methods and will print them. if child class has the same static method as the one inherited from parent, only child static method will print using the child class name, u can't upcast it.

 child class object can upcast and access parent static method and parent instance method.

 Parent p=new Parent();
 parent class object can downcast and access child static method but can't access child instance methods.

 parent class itself can't access child static method or instance methods.

 child c=new Parent();   won't compile

 Parent p=new child();
 

 */

