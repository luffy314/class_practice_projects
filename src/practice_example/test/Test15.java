package practice_example.test;
//messing with abstract classes and inheritance. abstaract classes can have private constructors and thus can't be extended too but they can still extend to another class.
public abstract class Test15 {
    int w=4;
    int x=29;
     Test15() {
        System.out.println("eath shit");
        w = 5;
        System.out.println(x);

    }
//    public  Test15 getCopy(){  trick to create object of abstract class didn't work
//         return this;
//    }

//abstract classes can have as many constructors
}
class Test152 extends Test15{
    int w=69;
    Test152(){
        System.out.println("child class");
        w=10;
        System.out.println(super.w);

    }
    public static void main(String[] args) {
        Test152 one= new Test152();
        System.out.println(one.w);
        System.out.println(one);

        System.out.println("-----");
        Test15 two=new Test152();
        System.out.println(two.w);
        System.out.println(two);

        System.out.println("------");
        System.out.println("trying to create abstract object");//not possible even using get method, just retursn a copy of line 27 object.

//        Test15 four=one.getCopy();
//        System.out.println(four.x);
//        System.out.println(four);

    }
}
