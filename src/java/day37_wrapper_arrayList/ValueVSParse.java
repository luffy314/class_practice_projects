package java.day37_wrapper_arrayList;

public class ValueVSParse {
    public static void main(String[] args) {
        String s = "30";

        int seconds = Integer.parseInt(s); // converts the "30" String into an int of 30

        Integer i = Integer.valueOf(s); // converts the "30" String into the Integer wrapper class object

        int i2 = Integer.valueOf(s);
        /*
            Integer.valueOf(s);  --> converts the "30" String into the Integer Object
            int i2 = --> im trying to store the value into a primitive variable

            primitive = object type  [ unboxing ]
         */

        Integer i3 = Integer.parseInt(s);
                /*
            Integer.parseInt(s);  --> converts the "30" String into the primitive datatype int
            Integer i3 = --> im trying to store the value into an Integer object

            object type = primitive [ autoboxing ]
         */

        String s2 = String.valueOf(30); // converts the 30 int to a String
        System.out.println(s2 + 5);


        }


    }

