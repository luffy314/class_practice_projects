package java.day38_arraylist;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {


        ArrayList<Character> letters = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++) {
            letters.add(i);
        }
        System.out.println(letters);

        letters.remove(Character.valueOf('a'));
        System.out.println(letters.remove(Character.valueOf('e')));
        letters.remove(Character.valueOf('i'));
        letters.remove(Character.valueOf('o'));
        letters.remove(Character.valueOf('u'));

        System.out.println(letters);


    }

}
