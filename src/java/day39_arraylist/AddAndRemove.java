package java.day39_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");
        System.out.println(list);

        System.out.println(list.remove("death"));

        list.add(2,"help");
        System.out.println(list);
        System.out.println(list.add("wolf"));



    }
}
