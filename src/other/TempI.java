package other;

// Java 9 program to illustrate
// private methods in interfaces
public interface TempI {

    public abstract void mul(int a, int b);
    public abstract void eat();

    public default void
    add(int a, int b)
    {
// private method inside default method
        sub(a, b);

// static method inside other non-static method
        div(a, b);
        System.out.print("Answer by Default method = ");
        System.out.println(a + b);

        eat();//abstract methods can be put in defualt methods
    }

    public static void mod(int a, int b)
    {
        div(a, b); // static method inside other static method
        System.out.print("Answer by Static method = ");
        System.out.println(a % b);
//        eat();//default methods and abstract methods, anything not static can't be put in static method
    }

    private void sub(int a, int b)
    {
        System.out.print("Answer by Private method = ");
        System.out.println(a - b);
//        eat();  all methods can be put in this
//        mod(3,4);
//        add(3,4);
    }

    private static void div(int a, int b)
    {
        System.out.print("Answer by Private static method = ");
        System.out.println(a / b);
        //takes only static methods
    }
}

class Temp implements TempI {

    @Override
    public void mul(int a, int b)
    {
        System.out.print("Answer by Abstract method = ");
        System.out.println(a * b);
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    public static void main(String[] args)
    {
        TempI in = new Temp();
        in.mul(2, 3);
        in.add(6, 2);
        TempI.mod(5, 3);
    }
}

