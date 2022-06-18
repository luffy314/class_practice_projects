package practice_example.test;

import java.nio.channels.ClosedByInterruptException;

public class Test14 {
    public static void main(String[] args) {

        Integer b=new Integer(5);
        Integer d=new Integer(5);

        Integer f=8;
        Integer a=8;

        Integer z=128;
        Integer x=128;

        System.out.println(b==d);
        System.out.println(b.equals(d));

        System.out.println(a==f);
        System.out.println(a.equals(f));

        System.out.println(x.equals(z));
        System.out.println(x==z);

        Byte g=new Byte((byte) 5);

        Byte p=new Byte((byte) 5);

        System.out.println("--------");
        System.out.println(g==p);
        System.out.println(g.equals(p));

        Byte r=Byte.valueOf((byte) 15);
        Byte q=Byte.valueOf((byte) 15);

        System.out.println(r==q);
        System.out.println(r.equals(q));

        Byte l= Byte.parseByte("20");
        Byte m= Byte.parseByte("20");

        System.out.println(l==m);
        System.out.println(l.equals(m));

        Byte n=17;
        Byte o=17;
        Byte i=Byte.parseByte("127",10);

        System.out.println("-------");
        System.out.println(n==o);
        System.out.println(n.equals(o));

        int j=3;
        int k=3;
        System.out.println(j==k);

        char[] data={'a','b','c'};
        System.out.println(String.valueOf(data));

        Boolean a1=true;
        Boolean a2=true;
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));

        System.out.println("----");

        Boolean a3=new Boolean(true);
        Boolean a4=new Boolean(true);
        System.out.println(a3==a4);
        System.out.println(a3.equals(a4));

        Character ono=new Character('a');
        Character two=new Character('a');
        System.out.println(ono==two);
        System.out.println(ono.equals(two));

        Character three='a';
        Character four='a';
        System.out.println(three==four);
        System.out.println(three.equals(four));

        Double five=new Double(120);
        Double six=new Double(120);
        System.out.println("------");
        System.out.println(five==six);
        System.out.println(five.equals(six));
        Double seven= Double.valueOf(20D);
        Double eight= Double.valueOf(20D);
        System.out.println(seven==eight);
        System.out.println(seven.equals(eight));

        System.out.println("-------");
        Long b1= Long.valueOf(23);
        Long b2= Long.valueOf(23);
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println("-------");

        Short b4=new Short((short) 5);

        Float c1=new Float(100);
        Float c2=new Float(100);
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
        Float c3= Float.valueOf(99);
        Float c4= Float.valueOf(99);
        System.out.println(c3==c4);
        System.out.println(c3.equals(c4));

        byte d1= (byte) 400;
        System.out.println(d1);

        short d2= (short) 33000;
        System.out.println(d2);

        int d3= (int) 2300000000L;
        int d4= (int) 2300000000L;
        System.out.println(d3==d4);

        short d5=200;
        short d6=200;
        System.out.println(d5==d6);

        double f1=23.0;
        double f2=23.0;
        System.out.println(f1==f2);

        System.out.println("---potort-----");

        Long f4= 20L;
        Long f3= 20L;

        System.out.println(f3==f4);
        System.out.println(f4.equals(f3));

        Double g1= Double.valueOf(14);
        Double g2= Double.valueOf(14);
        System.out.println(g1==g2);
        System.out.println(g1.equals(g2));

        Double g3= 44D;
        Double g4= 44D;
        System.out.println("------ ");
        System.out.println(g3==g4);
        System.out.println(g3.equals(g4));

        int h1= (int) 23F;
        System.out.println(h1);

//        Integer h2=(Integer) 55D;  can't convert between wrappers

        long m1= (long) 20D;
        System.out.println(m1);






    }
}
