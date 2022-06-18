package practice_example.test;

import java.util.Arrays;

public class Test17 {
    public static void main(String[] args) {

        String a="boy";//string pool is cached, so two references wit same value point to the same object, done to save memory since string is used often. only for string literals
        String b=a;
        String c="boy";
        c=c.toUpperCase();
        System.out.println(c.substring(1));
        String one=new String("boy");
        String two=new String("boy");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==c);
        System.out.println(c==c);
        System.out.println(a==one);
        System.out.println(one==two);

        char[] ch={'a','b','c'};
        String f="abc";
        String s = new String(ch);
        System.out.println(f.equals(ch));
        System.out.println(s.equals(ch));
        System.out.println(Arrays.toString(ch));
        System.out.println(s);

//        StringBuffer m=new StringBuffer(ch);  stringbuffer doesnt' work with chara array like string literal
//        StringBuilder n=new StringBuilder(ch); neither doed stringbuilder
        StringBuilder o=new StringBuilder("help");
        StringBuilder p=o;
        System.out.println(o);
        System.out.println(p);
        o=new StringBuilder("belly");
        System.out.println(o);
        System.out.println(p);
        System.out.println(o);
        p=o;
        System.out.println(p);
        p=o.append("fat");
        System.out.println(p);
        System.out.println(o);//stringbuffer not immutable, changing one reference value changes others as well

/*In the String constant pool, a String object is likely to have one or many references. If several references point to same String without even knowing it, it would be bad if one of the references modified that String value. That's why String objects are immutable.

Well, now you could say, what if someone overrides the functionality of String class? That's the reason that the String class is marked final so that nobody can override the behavior of its methods.*/



    }
}
