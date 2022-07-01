package other4;

public class Test7 {
    public static final int x;
    public final int y;

//    {
//        y=3;//works as well, and constructor works too to initalize final variables
//    }
    static {
        x=5;
    }

    public Test7(int y) {
        this.y = y;
    }
}
