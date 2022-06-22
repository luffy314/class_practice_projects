package other2;

import other.B1;

public class C1 implements B1 {
    public static void main(String[] args) {
        System.out.println(x);
        B1.climb();
    }

    @Override
    public void eat() {
        B1.super.eat();
    }

    @Override
    public void run() {

    }

    @Override
    public void rage() {
        B1.super.rage();
    }
}
