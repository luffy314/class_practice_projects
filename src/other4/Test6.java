package other4;

public class Test6 {
final int a=5;

}

class Test61 extends Test6{
//int a=3;  //u can change a final inherited varaible by redeclaring it


    public Test61() {
//        this.a=9;  //won't work this way, have to redeclare it
    }

    public static void main(String[] args) {
        Test61 one = new Test61();
//        one.a=4; //can't do this when it's final and inherited
        System.out.println(one.a);

        Test6 two=new Test61();
        System.out.println(two.a);
    }
}