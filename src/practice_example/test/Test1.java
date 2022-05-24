package practice_example.test;

interface Test1 {  //only public allowed,
   int x=3;  //only public allowed , can also be inherited
   abstract void help();  //only public allowed, also inherited, but can't be changed, only printed

    private void make(){  //private instance methods allowed, public, default, and protected not allowed

    }

    public default void cook(){   //default method can only be  public

    }

    static void shoot() {        //public static allowed but not inherited
        System.out.println("shoot");

    }

    private static void fight() {     //private static allowed too, private not inherited outside of class
        System.out.println("cool");

    }




}
