package day54_abstraction;

public interface Boy extends Create {
    default void fly(){
        System.out.println("die");
    }
    public abstract void read();

}
