package office_hours.day12;

import java.util.HashMap;
import java.util.Map;

public class P03_Maps {
    public static void main(String[] args) {
        Map<Integer, Person> scrumTeam1 = new HashMap<>();

        /*

        KEY       VALUE
        0         Person ("Mehmet","Tester",30,100000)

         scrumTeam1.get(0) -- it wil get value of key 0

         */

        Person person=new Person("Elmira","Developer",23,150000);
        scrumTeam1.put(0,person);


        scrumTeam1.put(1, new Person("James","Tester",24,130000));
        scrumTeam1.put(2, new Person("Dilshod","PO",26,180000));
        scrumTeam1.put(3, new Person("Olga","BA",23,125000));
        scrumTeam1.put(4, new Person("Ahmet","SM",28,150000));
        scrumTeam1.put(5, new Person("Hasan","Tester",23,145000));

        System.out.println(scrumTeam1);



        //replace(key, newValue): replaces the value of the given key with the given new value
        System.out.println("-----REPLACE ---- ");

        scrumTeam1.replace(1,new Person("Jennet",scrumTeam1.get(1).getJobTitle(),24,130000));
        System.out.println(scrumTeam1.get(1));


        //remove(key): removes the given key and its value from the map
        System.out.println("-----REMOVE ---- ");
        System.out.println(scrumTeam1.remove(1));


        //containsKey(key): returns true if the given key is conatined in the map, otherwise returns false
        System.out.println("-----containsKey ---- ");
        System.out.println(scrumTeam1.containsKey(1)); // false
        System.out.println(scrumTeam1.containsKey(2)); // true


        //containsValue(Value): returns true if the given value is conatined in the map, otherwise returns false
        System.out.println("-----containsValue ---- ");
        System.out.println(scrumTeam1.containsValue(person));

        //isEmpty(): returns true if the size of the map is 0, otherwise returns false

        //clear(): removes all the pairs from the map


        // Print all the keys
        System.out.println("-----KEYS ---- ");
        for (Integer eachKey : scrumTeam1.keySet()) {
            System.out.println(eachKey);
        }


        // Print all the values
        System.out.println("-----VaLues ---- ");

        for (Person eachPerson : scrumTeam1.values()) {

            //System.out.println(eachPerson);
            //print out each person name and jobtitle

            System.out.println(eachPerson.getName()+" "+eachPerson.getJobTitle());
        }


        // Print all key and values
        System.out.println("-----EntrySet ---- ");

        for (Map.Entry<Integer, Person> eachEntry : scrumTeam1.entrySet()) {


            System.out.println( eachEntry.getKey()+" "+eachEntry.getValue().getName());
        }



        // Increase all testers salary 20 K

        for (Map.Entry<Integer, Person> eachEntry : scrumTeam1.entrySet()) {
            if(eachEntry.getValue().getJobTitle().equals("Tester")){
                scrumTeam1.replace(eachEntry.getKey(), new Person(eachEntry.getValue().getName(),eachEntry.getValue().getJobTitle(),eachEntry.getValue().getAge(),eachEntry.getValue().getSalary()+20000));
            }

        }

        System.out.println(scrumTeam1);

    }
}
