package practice_example.test;

import java.util.Arrays;

public class Test4 {
    public int a = 9;
    public static String gender="male";

    public static void kill() {
        System.out.println("kill");
    }

    public void shoot(){
        System.out.println("object parent");
    }


    public static void main(String[] args) {
        Test4.kill();

        Test4 four = new Test4();
        four.kill();

    }
}
