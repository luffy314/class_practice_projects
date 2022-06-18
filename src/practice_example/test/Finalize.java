package practice_example.test;

public class Finalize {
    int a=5;
    public static void main(String[] args) {
        Finalize one=new Finalize();
        one.finalize();

        one=null;

        System.gc();
        System.out.println("Inside the main() method");
    }
    protected void finalize()
    {
        System.out.println("Object is destroyed by the Garbage Collector eat shit");
    }
}
//how finalize and garbage collect work