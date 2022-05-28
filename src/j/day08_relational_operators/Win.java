package j.day08_relational_operators;

public class Win {

    public static void main(String[] args) {

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
//            w = -20 + -19   +   19 * 19 %2;
//                 -39  +          361%2
//                  -39            +  1
        System.out.println(R);
        System.out.println(W);
        System.out.println(361%2);
    }
}
