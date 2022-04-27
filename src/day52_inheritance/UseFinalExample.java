package day52_inheritance;

public class UseFinalExample {
    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);
//        FinalExample.PLANET = "Mars";

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

//        obj.a = 4;
//        obj.b = 40;

        System.out.println();
        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.a);
        System.out.println(obj2.b);

        /*

        obj and obj2 were separate objects. Each object has its own copy of instance variables a and b, both are final, so they cannot be changed.

        a was hardcoded to be 5 in the class
        b was assigned in the constructor call
         */

    }

}
