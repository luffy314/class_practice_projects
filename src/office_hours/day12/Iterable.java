package office_hours.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {

         /*
        Remove names from list if the length smaller than 6 or  name startswith M

         */
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Mehmet", "Toghrul", "Olga", "John", "Erjon", "Daniel", "Emre", "Kamil"
        ));

        /*
        for (int i = 0; i < names.size(); i++) {

            if(names.get(i).length()<6 || names.get(i).startsWith("M")){
                names.remove(i);
            }


        }
        System.out.println(names);

         */


        /*
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
             String currentName=iterator.next();

            if(currentName.length()<6 || currentName.startsWith("M")){

                iterator.remove();
            }


        }

         */


        names.removeIf(each->(each.length()<6 || each.startsWith("M")));

        System.out.println(names);





    }
}
