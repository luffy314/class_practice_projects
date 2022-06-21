package other2;

import other.A;

public class B extends A {
    int z=333;
    // Outside of the package protected field can be accessed through inheritance
    public void printUsingInheritance() {
        System.out.println(a);
        System.out.println(z);
    }

    // In child class we can access protected field through instantiation of child class
    // But should we do that ? .... No
    public void printUsingInstantiation() {
        B b = new B();
        System.out.println(b.a);
        System.out.println(b.z);//z is public variable

        // But not through instantiation of the class which contains the protected field
        A a = new A();
//        System.out.println(a.a); // Compilation error “The field A.a is not visible”

        A c=new B();//still won't work, u'll have to cast to subtype to access protected a
        System.out.println(((B) c).a);
//        System.out.println(c.a);  //won't work

        System.out.println(c.z);
    }
}
class D {

    // We can not access protected field outside of the child class through instantiation
    public void printUsingInstantiation() {
        B b = new B();
//        System.out.println(b.a); // Compilation error “The field B.a is not visible”

        System.out.println(b.z);//z is publick so it can be accessed outside paackage as long as clss is public
    }
}

class C extends B {

    // outside of the package protected field can only be accessed through inheritance
    public void printUsingInheritance() {
        System.out.println(a);
    }

    // In child class we can access protected field through instantiation as well
    public void printUsingInstantiation() {
        C c = new C();
        System.out.println(c.a);
    }


    public static void main(String[] args) {

        first:
        {//this is called a java labe.  A Label is used to identifies a block of code.
            System.out.println("hello");

            second:
            {//label within label
            }

            (new B()).printUsingInheritance();
            (new B()).printUsingInstantiation();
            (new D()).printUsingInstantiation();

        }
    }
}