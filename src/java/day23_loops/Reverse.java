package java.day23_loops;

public class Reverse {
    public static void main(String[] args) {
        String a = "java";
        for (int b = a.length() - 1; b >= 0; b--) {
            System.out.println(a.charAt(b));
        }
    }
}
