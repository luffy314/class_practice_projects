package practice_example.practice;

import practice_example.test.Test2;

public class Test {
    //Java code for using 'this' keyword
//to return the current class instance

        int a;
        int b;

        //Default constructor
        Test()
        {
            a = 10;
            b = 20;
        }

        //Method that returns current class instance
        Test get()
        {
            return this;  //same as return new Test();
        }

        //Displaying value of variables a and b
        void display()
        {
            System.out.println("a = " + a + " b = " + b);
        }

        public static void main(String[] args)
        {
            Test object = new Test();
            object.get().display();
        }
    }

