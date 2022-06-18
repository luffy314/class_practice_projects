package practice_example.test;

import j.day49_inheritance.Building;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test16 extends Boy {
    int a=5;
    String b="fjdlf";

public Test16(){

    System.out.println("0");
}
    public Test16(int a, String b) {
        System.out.println("3");
        this.a = a;
        this.b = b;
    }


}


class Boy{
    int c=5;

    public Boy(){
        System.out.println("eat shit");
    }

}
class Cool{

    public static void main(String[] args) {

        Test16 one= new Test16(3,"boy");
        System.out.println(one);
    }
}