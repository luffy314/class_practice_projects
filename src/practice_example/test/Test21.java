package practice_example.test;

public class Test21 {
static int n=29;
    public Test21() {
        System.out.println("parent");
    }

    int x=5;

    static {
        System.out.println("parent static block");
        Test21 e=new Test21();
    }
    void eat(){
        System.out.println("parent eat");
    }

    static void run(){
        System.out.println("parent run");
    }
    void sleep(){
        System.out.println("parent sleep");
    }

}
class Test211{//class not extended
    static Test21 one;
    Test21 two;

    public Test211() {
        System.out.println("child constructor");
    }

    static{//when u don't extend class to parent class, then this static block will run first and then call the static block in other class when static object line is executed.
        System.out.println("child static block");
        one=new Test21();
        System.out.println("child static block 2");
        System.out.println(one.x);
        one.eat();
        one.run();//u can create static objects inside static block as long as u declare them outside (can't use static keyword inside static block), then u can use the object to call everything.

    }

    {
        System.out.println("child iiB");
        two=new Test21();
        System.out.println("child iiB 2");

    }

    public static void main(String[] args) {
        Test21 three=new Test21();//just prints parent statement in constructor
        Test211 four =new Test211();
    }
}

class Test212 extends Test21{
int z=5;
    static Test21 six;
    Test21 seven;
    Test212 b;

    Test21 d;

    public Test212() {
        System.out.println("child constructor");
    }


    void eat(){
        System.out.println("child eat");
    }

    static void run(){
        System.out.println("child run");
    }


    static{
        System.out.println("child static block");
        six=new Test21();//parent methods and bariables will be printed cause of parent object created
        System.out.println("child static block 2");
        System.out.println(six.x);
        six.eat();
        six.run();//u can create static objects inside static block as long as u declare them outside (can't use static keyword inside static block), then u can use the object to call everything.

    }

    {//if u create same class object in IBB, u will cause infinte loop/stackoveflow
        System.out.println("child iiB");
        seven=new Test21();
//        Test212 a=new Test212();  created infinite loop, stackoverflow
//        b=new Test212();   created infinite loop, stackoverflow
        System.out.println("child iiB 2");
        seven.eat();
        seven.run();

//        d=new Test212(); nope this way using polymorphism still caused infintie loop
//        d.eat();
//        d.run();
//        System.out.println(d.x);
//        a.eat();
//        a.run();
//        System.out.println(a.z);
//        b.eat();
//        b.run();
//        System.out.println(b.z);

//        System.out.println(seven.z); can't access child variables with parent obkect

    }

    public static void main(String[] args) {
        Test212 nine= new Test212();
        Test21 c=new Test212();

        System.out.println(nine.z);
        System.out.println(n);//static variables can be executed by themselves but instance need object with it

    }



}


class Test213 extends Test21{
    void sleep(){
        System.out.println("child sleep");
    }

    public static void main(String[] args) {
        Test21 one=new Test213();
         one.sleep();// instance method in child class won't run unless parent class has same instance method to be overriden. will give compile error and tell u to cast to child class. though if instance method is in parent but not child, then the parent method will still run.


//        Test213 two=new Test21(); //not possible
    }

}