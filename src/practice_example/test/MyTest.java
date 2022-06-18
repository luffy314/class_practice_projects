package practice_example.test;

// A tricky Java code to predict the output
// based on order of
// execution of constructors, static
// and initialization blocks
class MyTest {
    static
    {
        initialize();//static block is executed first and cant be debugged if u don't use breakpoints
    }

    private static int sum;

    public static int getSum()
    {
        initialize();
        return sum;
    }

    private static boolean initialized = false;

    private static void initialize()
    {
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true;
        }
    }
}

 class GFG1 {
    public static void main(String[] args)
    {
        System.out.println(MyTest.getSum());
    }
}

