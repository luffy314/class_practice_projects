package day23_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String s = "java";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        System.out.println("With loop");

        for(int i = 0; i < s.length(); i++) { // i <= s.length() - 1
            System.out.println(s.charAt(i));
        }

        String a = "java";
        for(int b=a.length()-1;b>=0;b--){
            System.out.println(a.charAt(b));
        }

    }
}
