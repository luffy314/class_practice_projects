package practice_example.test;
//inner cllases can break so many rules
public class Test25 {

    public abstract class Test251 {
        abstract void kill();

    }

    protected abstract static class Test252 {

    }

    private static abstract class Test253 {

    }

    private static class Test254 {

    }

     interface Test255 {
        abstract void read();
        default void fly(){
            System.out.println("fly");
        }

    }

    private static interface Test256 {

    }

    private abstract interface Test257 {

    }

//    private final static interface Test258 {//final isn't allowed
//    }

//    public final static abstract class Test259{//final still not allowed for abstract classes and interfaces
//
//    }

}

class Test250 extends Test25{//inherits stuff in parent class like the inner classes but doesn't have to do anything with them

}