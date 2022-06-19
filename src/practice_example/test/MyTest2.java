package practice_example.test;
//testing out static block placement in class body and how it effect the initialization of static variables. if static block is after static variables, then static variables will equal whatever static block says. if static block is before static variables, then for variables that are only declared, they will take the static block value, but for static varaibles that are already initalized with a value, they will keep their value and only take the static block value when static block is running then they will reset to their original value. same rules apply for instance variables and IIB.
public class MyTest2 {

    //instance variables and IIB tests here
    int r=20;
    int e;
    {
        r=1200;
        e=599;
        l=444;
        j=99;
    }
    int l=40;
    int j;





    //static varaibles and static block tests here
    static boolean old=false;
    static boolean rich=false;
    static int x;
    static int y=5;
    static char c;
    static char f=31000;
    static char q='∂';
    static char d='z';
    static String str;
    static String str2=null;
    static String str3="test";
    static String str4="test";



    static {
        System.out.println("fdslfjd");
        rich=true;
        old=true;
        x=50;
        y=55;
        c='a';
        f='r';
        d='b';
        str="gggggg";
        str2="fzfzfzf";
        str3="oooooo";
        str4=null;
//        change();


    }
//    static boolean old=false;
//
//    static boolean rich=false;
//    static int x;
//    static int y=5;
//   static char c;
//   static char f=31000;  u can just put a number to represant that character for char or u can do unicode '\u0000' which is hexadecimal i think
//   static char q='∂';
//   static char d='z';
//   static String str;
//   static String str2=null;
//   static String str3="test";
//   static String str4="test";


    static void change(){
        old=false;
    }

    public static void main(String[] args) {
        System.out.println(MyTest2.rich);
        System.out.println(MyTest2.old);
        System.out.println(MyTest2.x);
        System.out.println(MyTest2.y);
        System.out.println(MyTest2.c);
        System.out.println(MyTest2.d);
        System.out.println(MyTest2.str);
        System.out.println(MyTest2.str2);
        System.out.println(MyTest2.str3);
        System.out.println(str4);
        System.out.println('\u0000');//default value for char, it means null pretty much
        System.out.println(f);
        System.out.println('\uffff');

        System.out.println("IIB------------");
        MyTest2 one=new MyTest2();

        System.out.println(one.r);
        System.out.println(one.e);
        System.out.println(one.l);
        System.out.println(one.j);
    }
}


