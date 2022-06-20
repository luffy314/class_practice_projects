package practice_example.test;

public class Test20 {

    final int a=69;
    int x=5;
    static int z=30;





//    void shoot(){
//        System.out.println("parent shoot");
//    }

static int fly(){
    System.out.println("parent fly");
    return 0;
}

    static void eat(){
        System.out.println("parent eat");
    }
//    void Test20(){ u can create static and instance methods with same name as class
//        System.out.println("parent same name");
//    }
}
class Test201 extends Test20{
String a="child power";
    int y=20;
    void shoot() {
        System.out.println("child shoot");
    }



    static void win(){
        System.out.println("child win");
    }

// private static void fly(){
//        System.out.println("parent fly");
//    }  can't create another static method same as parent's one but with different return type or lesser access mdoifier. static methods aren't overridden but behave same way when writing it.

    public static void main(String[] args) {
        Test20 one=new Test201();
//        one.shoot; won't work when parent doesn't have same instance method, u'll have to cast it down
        ((Test201) one).shoot();

        System.out.println(one.z);
        one.eat();
        System.out.println(one.x);
        System.out.println(((Test201) one).y);

//        one.z.  can't access static variable if child class doesn't have same variable
        ((Test201) one).win();//if parent class doesn't have static method or instance method or instance variable or static variable, then u have to cast to child

        Test201 two=new Test201();
        two.win();
        System.out.println(two.z);
        two.eat();
        System.out.println(((Test20)two).a);//if u don't cast it up, then int a will be replaced by String a in child class. when hiding, u  can even change the type.

    }
}
