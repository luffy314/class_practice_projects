package other2;

public class Fun {

   final static synchronized strictfp public void main(final String... pooooop) {

        System.out.println("poop");
    }
    // Overloaded main methods, won't run since not string array
    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        Fun.main("Dear Geek","My Geek");
    }
    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }
}
class Sun extends Fun{
    //inherited main metgod so can run main method implicitly unless its final, then u can still run but can't override.
//    public static void main(String[] args) {
//        System.out.println("child");
//    }
}