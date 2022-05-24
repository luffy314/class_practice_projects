package practice_example.test;

public class Test1Sub extends Test1Example {
    public static void main(String[] args) {
        Test1Sub ass= new Test1Sub();

        ass.create();   //inherits instance method

        System.out.println(ass.a); /// static variable can be inherited but mainly printed
        ass.y=4;  //instance variables are inheritable
        ass.z=5;

        Test1Sub.sing();
        Test1Sub.run();  //static methods can be inherited but only called by subclass name
        Test1Example.run();  // u can call a superclass static method using the superclass classname or superclass object and the subclass name but not the subclass object.


    }


}
