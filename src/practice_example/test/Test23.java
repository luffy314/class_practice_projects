package practice_example.test;
//playing with static and instance methods and overriding rules/ access modifier, parameters, and return type
public abstract class Test23 {//abstract classes can only be public and default

    public  abstract Object race();//abstract methods can't be static or final or private.they're meant oto be inherited, overridden and for the objects
    public int x=17; //abstract keyword not allowed, since it's only for methods and u can already declare variables without initizilaing
    void shoot(){
        System.out.println("parent shoot");
    }
    static Object eat(){
        System.out.println("parent eat");
        return null;
    }
}
class Test231 extends Test23 implements Test232{
    int x=34;//inherited instance or static variable can have different types and weaker access modifier, or add or remove static keyword or final. child will still call it over parent one.

    @Override
    public String race() {//overidden abstract method can't have weaker access modifier but can have subtype return type
        return null;
    }

    void shoot(){//u can't change the parameters for overriding, othersie parent will get called instead
        System.out.println("child shoot");
    }

    static String eat(){//can't have weaker access modifier than parent static method.return type has to be the same or subtype
        System.out.println("child eat");
        return null;
    }

    @Override
    public void swim() {
//        Test232.super.swim(); //use this way to call interface default methods, use super for noraml classes and abstract too

        System.out.println("child swimmmmm");
    }

    public static void main(String[] args) {

        Test231.eat();//child class can call inherited static method even if not written in child class body
//        Test231.shoot();//can't call instance method using class name (class is for sttatic)

        Test231 one=new Test231();
        one.eat();
        (new Test231()).eat();//just a different way to call inherited static method using child class
       one.shoot();
//        one.shoot(4);
        System.out.println(one.x);
        one.swim();
        System.out.println(one.g);
        System.out.println(Test231.g); //inteface varaibels are inherited and can be called by both child class name and child object

        System.out.println("---------");

        Test232 four=new Test231();
        System.out.println(four.g);
        four.swim();


        System.out.println("---------");

        Test23 two=new Test231();
//        two.shoot(5); tried giving child class overridden method a different parameter but then it broke the connection between parent and child instance method, so it was no longer overriding


    }
}
 interface Test232{//inteface can only be public and default. u can only be public when ur at the top and java file is named after u, that's why it's default here and can't be public


     int g=555;

     default void swim(){
        System.out.println("swim inteface");
    }

}