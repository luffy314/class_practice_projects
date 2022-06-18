package practice_example.test;

// Java program to illustrate super() by default
// executed by compiler if not provided explicitly

class Parent {
    int x=5;
    static {
        System.out.println("parent static");
    }
    Parent()
    {
        System.out.println("Parent class's No " +
                "argument constructor");
    }
    Parent(int a)
    {
        System.out.println("Parent class's 1 argument" +
                " constructor");
    }
    {
        System.out.println("parent iib");
    }

}

class Base extends Parent {

    Base()
    {
        this(5);
//        int x1 = super.x;
//        int x2 = this.x;
        // By default compiler put super()
        // here and not super(int)
        System.out.println("Base class's No " +
                "argument constructor");
    }
    Base(int x){super();

    }
    static {
        System.out.println("child static");
    }
    {
        System.out.println("child iib");
    }
    public static void main(String[] args)
    {
        new Base();
        System.out.println("Inside Main");
    }
}

/*paernt plus child
static block in both first
then parent IIB next
then parent constructor statement and actions
then child IIB
then child constructor arguments

u can't use both super() and this() in same constructor. compiler will use defualt super() if u don't specifiy even if super() constructor doesn't exist. u can use those two only in constructors but u can use this and super in methods and anywhere else except for static block/methods
*
*
* */