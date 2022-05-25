package practice_example.practice;

// Java program to demonstrate
// why a non-static variable cannot
// be accessed from a static context

// Creating a class A
class A2 {

    // A non-static variable
    int N;
    static int y;

    // Static method
    public static void increment()
    {
        // this throws a compile - time error.
        System.out.println("help");
    }
}

class Demo {

    // Main method
    public static void main(String args[])
    {
        // Creating multiple objects
        // for class A
        A2 obj1 = new A2();
        A2 obj2 = new A2();
        A2 obj3 = new A2();

        // Assigning the different values
        // for the non static variable N
        obj1.N = 3;
        obj2.N = 4;
        obj3.N = 5;

        // Calling the method
        obj1.increment();
        A2.increment();
        A2.y=4;
        obj1.y=3;

        System.out.println(obj1.N);
        System.out.println(obj2.N);
        System.out.println(obj3.N);
        System.out.println(A2.y);
        System.out.println(A2.y);
        System.out.println(obj1.y);
    }
}

