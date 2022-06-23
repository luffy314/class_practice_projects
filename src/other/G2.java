package other;

public class G2 implements F1,F2{
    @Override
    public void shoot() {
        F1.super.shoot();
    }

    public static void main(String[] args) {
        F1 d =new G2();
        d.shoot();
        F2 z= (F2) d;
        z.win();

    }
}
