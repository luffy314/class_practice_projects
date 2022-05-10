package practice_example;

public class Practice12 {
    public static void main(String[] args) {
        B cool=new B();
        System.out.println(cool);


    }
}
class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        System.out.println("B");
    }
}
