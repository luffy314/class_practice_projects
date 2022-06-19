package practice_example.test;
//see MyTest2 for full explanation if u need it, was a headache
// A tricky Java code to predict the output
// based on order of
// execution of constructors, static
// and initialization blocks
class MyTest {
    static
    {

        initialize();//static block is executed first and cant be debugged if u don't use breakpoints
   initialized=true;
    }

    private static int sum;

    public static int getSum()
    {
        System.out.println(initialized);
        initialize();
        System.out.println(initialized);

        return sum;
    }

     private static boolean initialized=false;

    private static void initialize()
    {
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true;
            System.out.println(initialized);
        }
    }
}

 class GFG1 {
    public static void main(String[] args)
    {
        System.out.println(MyTest.getSum());
    }
}

