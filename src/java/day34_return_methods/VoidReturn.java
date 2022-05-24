package java.day34_return_methods;

public class VoidReturn {
    public static void main(String[] args) {
    sayHello();
    //System.out.println(sayHello());
    //String msg = sayHello(); this doesn't work because the method is void

    sayBye();
        System.out.println(sayBye());
    String msg = sayBye();
        System.out.println(msg);


}

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){
        return "Bye";
    }
}
