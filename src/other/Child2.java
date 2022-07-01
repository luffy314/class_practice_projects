package other;

import other2.Parent;

public class Child2 extends Parent {//can't have covariant parameters because of liskov principle
//return type is covariant and must be less in child and parameter type is invaraint and must be same
    public String test(Object one){//here and also class inside interface
        System.out.println("child test");
        return "it works";
    };

    public static void main(String[] args) {


        Parent alpha = new Child2();
//        alpha.test("child p");  not allowed, cause of protected, even then still doesn't override, ony calls parent unless u cast to child

//        alpha.test("help");
        ((Child2)alpha).test(new Object());
    }
}


class Test3{
    public static void main(String[] args) {



    }
}