package java.day22_loops;

public class Test {
    public static void main(String[] args) {
        int a=10;
        a= --a + a++ + a-- + a++;
        System.out.println(a);
    }
}
