package other2;

import java.util.ArrayList;

public class God {

    public static void main(String[] args) {






        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add("book");
        list.add("one");
        list2.add("book");
        list2.add("one");
        list2.add(null);
        list.add(null);
        list.add(new String("taken"));
        list2.add(new String("taken"));

        //as long as both lists have everything in same order, and size, they will be equal.
        System.out.println(list.equals(list2));
    }
}
