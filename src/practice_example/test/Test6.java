package practice_example.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {

        Random one=new Random();
        System.out.println(one.nextInt(9));

        String a="aabbccddeee";
        String b=a.replace('a','z'); //replaces every old character with new
        String c=a.replace("aa","zzz"); //replaces ever old character sequence with new

        System.out.println(b);
        System.out.println(c);
        String d=a.replaceFirst("c","pp"); //works on only string and replaces first character sequence
        System.out.println(d);

        String e=a.replaceAll("ee","QQQ");//works on only string and replaces all character sequence
        System.out.println(e);

        final String m="help";
        System.out.println(m.concat("doggy"));
        String s="booty";
        s=m;
        System.out.println(s);

//        String t="tale";
//        s=t;





    }
}
