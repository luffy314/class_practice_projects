package j.day54_abstraction;

public interface Create{

     int poop=314;

     public static void print(){
        System.out.println("print");
    }


     default void fly(){
        System.out.println("fly");
    }
    public abstract void read();

    void write(); // any method made in the interface is public abstract
}
