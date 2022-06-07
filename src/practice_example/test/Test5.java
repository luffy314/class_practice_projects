package practice_example.test;

public class Test5 extends Test4{
    public String smell;
    public int a=5;
    public static String gender="female";


    public static void kill(){
        System.out.println("potato");
    }
    public void shoot(){
        System.out.println("object child");
    }
    public static void main(String[] args) {
        Test4 one=new Test4();
        one.kill();
        kill();
        System.out.println(one.a);
//        ((Test5)one).shoot();  //creates class cast exception
        one.shoot();
        System.out.println(one.gender);
        System.out.println(Test4.gender);

        System.out.println("---------");

        Test4 two=new Test5();
        ((Test5)two).kill();
        two.kill();
        ((Test5) two).smell="help";
        System.out.println(two.a);
        ((Test5) two).shoot();
        two.shoot();  //parent reference type calss childs instance method only for instance methods cause of a special runtime polymorphism. everything else will call parent value.
        System.out.println(two.a);
        System.out.println(two.gender);

        System.out.println("---------");

        Test5 three=new Test5();
        three.kill();
        three.kill();
        Test5.kill();
        three.shoot();
        System.out.println(gender);
        System.out.println(three.gender);


        System.out.println(three.a);


    }

}
