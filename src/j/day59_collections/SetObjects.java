package j.day59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("400");
        set.add("hello");
        set.add("%");
        System.out.println(set);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("hello"); // nothing is changed, duplicate not allowed
        set2.add("%");
        set2.add("400"); // nothing is changed, duplicate not allowed
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
//        set3.add(null); null not allowed in TreeSet
        set3.add("hello");
        set3.add("$4.5");
        set3.add("400");
        set3.add("hello"); // nothing is changed, duplicate not allowed
        set3.add("%");
        set3.add("400"); // nothing is changed, duplicate not allowed
        set3.add("WORLD");
        System.out.println(set3);
    }
}
