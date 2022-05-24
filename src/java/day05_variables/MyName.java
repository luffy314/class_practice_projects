package java.day05_variables;

public class MyName {

    public static void main(String[] args) {

        char myName1 = 'a';
        char myName2 = 'l';
        char myName3 = 'i';

        System.out.println(myName1 + "\n" + myName2 + "\n" + myName3);
        System.out.println("" + myName1 + myName2 + myName3);

        String name = "" + myName1 + myName2 + myName3;

        System.out.println(name);
    }

}
