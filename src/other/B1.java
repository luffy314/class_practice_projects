package other;

public interface B1 {//class default or public, same as abstract classes and concrete

     int x=5;//variables are all public static final by default and can't be anything else.constants

    public default void eat(){

    }

    abstract void run();//methods are public anstract by default.abstract methods can only be prublic.

     default void rage() {//default methods are public default and can't be less
         System.out.println("rage");
     }


     private void aim(){//private instance methods allowed and only private alloweed. can be final
     }
     private  void fiire(){

     }


     static void climb() {//static methods can only be public or private
    }
     private static void dig(){//static methods in interface arem't inherited

     }


  static interface A20{//can't have private or protected inner classes in interface. even default might be just public instead. static allowed
}

abstract interface A21{};

     class A22 {//normal classes allowed, prob secretly public

     }

     abstract class A23{

     }
//     private class A24{ private not allowed in interface, only public classes and interfaces allowed

     }
     final class A24 {
     }

//     final interface A25{ final interface and final abstract not allowed, only final classs

//private class A25{} private classes not allowed either, jsut public





