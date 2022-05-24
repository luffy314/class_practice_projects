package java.day54_abstraction;

public class Power {
    public static void main(String[] args) {
        Book one=new Book();
        one.fly();
        System.out.println(one.poop);

        Create test=new Book();
        System.out.println(test.poop);
        test.fly();
        test.read();
        Create.print();
    }
}
