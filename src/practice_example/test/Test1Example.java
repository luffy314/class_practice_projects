package practice_example.test;

public class Test1Example extends TestAbstract implements Test1 {
    public static void main(String[] args) {
        Test1Example one=new Test1Example();
        System.out.println(one.x);  //using final static variable

        Test1.shoot();  //call static method using interface
//        Test1.x       // call final static variable using interface

//        one.shoo      //static method not inherited
        one.cook();    ///default method inherited
//        Test1.cook();   //default method can't be used by interface



    }

    public Test1Example() {
        Test1.super.cook();
//        super      // consturctor can't be used to inherit anything from interface, u can use super to call interface default method in the constructor or in the overriden method (help). nothing else
    }

    @Override
    public void help() {
        System.out.println("potoato");
    }

    public static void run(){     //static methods can't
        System.out.println("run");
    }

}
