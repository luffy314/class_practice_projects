package day41_arraylist;

public class Wrapper {
    public static void main(String[] args) {


        /*
            Why do we need wrapper classes?

            - Collection allows only OBJECTS (non-primitive )
                    String, Integer,Double etc

            - Collection --> Arraylist etc
            - Wrapper classes has many useful methods

                - Character.isDigit()
                - Character.isUpperCase()
                - Character.isLowerCase ()
                - valueOf() vs parseInt()/parseDouble() etc

            - To convert primitives to OBJECTS

            - Autoboxing vs Unboxing

                Autoboxing --> Primitive to OBJECTS
                Unboxing   --> OBJECTS to primitive

         */


        System.out.println("-------------");

        //Autoboxing --> Primitive to OBJECTS

        Integer a=new Integer(30);

        Integer b=30;

        // these 2 are totally same

        System.out.println("-------------");


        //Unboxing   --> OBJECTS to primitive
        Integer c=Integer.valueOf(30);

        int d=c;  // Unboxing


        System.out.println("-------------");

        // valueOf() vs parseInt()/parseDouble() etc

        // valueOf()      --> returns Objects ( Wrapper Class )

        // parseMethods() -->  returns primitives

        int e =Integer.parseInt("123");

        Integer f = Integer.valueOf(123);


        System.out.println("-------------");

        // Wrapper Classes Methods

        System.out.println(Character.isDigit('a'));      // F
        System.out.println(Character.isUpperCase('a'));  // F
        System.out.println(Character.isLowerCase('a'));  // T



        System.out.println("-------------");

        // Casting is not possible with Wrapper Classes
        Integer num = Integer.valueOf(123);
        // Double doub=num;


    }
}
