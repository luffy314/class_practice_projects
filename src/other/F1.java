package other;

public interface F1 {
    default void shoot(){
        System.out.println("help");
    }
    public static void main(String[] args) {
//        F1 b= (F1) new F2();
//        b.shoot();
    }
}
