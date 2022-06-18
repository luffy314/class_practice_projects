package practice_example.test;

public class Test8 {   //static block vs instance initailaor block, static block wins and only appears once while IIB appears for every object.

    int x=5;
    int a;
    static int y;
    static int b;//will print default value 0

    {
        System.out.println("IIB");//prints second
        a=100;
        b=50;//won't print anything, not connected to static variable since it's not in static block
    }

    static {
        System.out.println("static block");   //prints first
        y=10;
        int z=35; //does nothing since u can't make instance reference inside static refernce
    }

    Test8(int x,int a){
        System.out.println("constructor");//prints third then followed by instance and static variables
        this.x=x;//these values are will be what gets printed
        this.a=a;
    }

    public static void main(String[] args) {
        System.out.println(Test8.y);
        System.out.println(Test8.b);

        Test8 one=new Test8(7,29);
        System.out.println(one.x);
        System.out.println(one.a);
        Test8 two=new Test8(8,22);

        System.out.println(one);
        System.out.println(two);
        final int f=5;//can't re-assign value for primitives and can't change refernce when it's objects



    }
}
