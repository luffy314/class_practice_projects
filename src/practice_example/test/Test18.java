package practice_example.test;
//program to show ghd relationship between interface and class and static/default/abstract and variables, also static block too


interface Test18 {//only place u can put static in for classes is nested classes
int x=5;
int y=23;

//static {} static blocks not allowed in interface
    default void talk(){
        System.out.println("talk");
        eat();//can put a static method inside a defualt method
        System.out.println(x);//can put static variable inside a default method
    }
    static void eat() {
        System.out.println("eat");
//        talk(); can't put default method insdie static method
    }
//    void kill(); abstract methods in interface and abstract classes have to be implemented in concrete class otherwise compiler error


}
class Test19 implements Test18{
    static boolean win=false;
    static int z;
   static int x=8;
    public void talk() {//default methods are overridden just like instance methods
        System.out.println("child talk");
        eat();//can't be used to call parent static method
    }
    static void eat(){//only way to call an interface static method is through interface name or inside default method
        System.out.println("child eat");
        win=true;
        z=7;
    }

    static {
        System.out.println(z);
        eat();
        System.out.println(win);
    }
    void staticTest() {
        System.out.println(z);
        System.out.println(win);

    }



    public static void main(String[] args) {
        Test19 one = new Test19();
////        ((Test18)one).eat();  doesn't work
////        ((Test18)Test19).eat();    doesn't work whether u cast or not
        Test18.eat(); //works
        System.out.println(one.x);
//        System.out.println(((Test19) Test18).x); can't cast down
        System.out.println(Test19.x);
        System.out.println(Test18.x);
//        System.out.println(((Test18) Test19).x); doesn't work
//        one.talk(); tried calling parent static method, didn't work

////
//        Test18 two = new Test19();
//        ((Test18)two).eat();   //only way to access interface static method is by using interface class name


        Test18 three=new Test19();
        three.talk();
//        three.eat(); tried calling parent static eat, didn't work
        System.out.println(three.x);// it will always print parent class x, can't even cast down
//        Test19.talk();  can't use default method with class, default is similar to instance method
//        Test18.talk();   can't use default method with class, default is similar to instance method


        Test19 four=new Test19();
        Test19.eat(); //works but u can't cast to parent static method for interfaces
        four.eat();//works but u can't cast to parent static method for interfaces

//        ((Test18)Test19).eat();//npe
//        ((Test18)one).eat();//nope

        System.out.println(four.x);

        four.talk();// calls child talk()
        System.out.println("-----");
        ((Test18)four).talk();//doesnt' cast to parent defalut methods

        Test18 five=new Test19();
        five.talk();//using parent reference will still print child overriden defaault method.

        // what i learned. only thing that can call an interface static method is interface class name. u can put static method inside a default method, but u can't do much with it since u can't create an interface object and default methods are for being overridden. correction to what i just said, if u don't override an interface default method, then u can create a child object in any way and call the default method using the object to run it and u can also run the parent static method by putting it sinde the default method cody body(only other way to run parent static method)). inteface static variable will always print interface variable unless u create a copy in child, then child will always be printed unless the reference is the parents, casting isn't allowed i believe. abstract methods in inteface need to be overriden in child otherwise compile issue. overriden default methods in child class can only be called in child class, it's like an instance method, u can't use a class to call it, only object of child class. overrien defulat method in child class will always be called and u can't cast up, if it's not overridden then u can call the parent defualt method.


        Test19 six=new Test19();
        six.staticTest();
        System.out.println(Test19.win);
        System.out.println(six.y);
        six.talk();//child class object can print interface default method if i comment out overriden method and when using parent reference it will do the same

    }
}