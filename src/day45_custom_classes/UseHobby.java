package day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class UseHobby {
    public static void main(String[] args) {

        Hobby one = new Hobby("gaming", 100,false,true);
        Hobby two = new Hobby("travel",5000,true,false);
        Hobby three = new Hobby("basketball",50,true,true);

        System.out.println(one);

        ArrayList<Hobby> hobbyList = new ArrayList<>();
        hobbyList.addAll(Arrays.asList(one,two,three));

        System.out.println(hobbyList);

        for(Hobby each:hobbyList){
            System.out.println(each);
            each.doIt();
        }

        ArrayList<Hobby> hobbyList2=new ArrayList<>(hobbyList);

        System.out.println();

        hobbyList2.removeIf(each -> each.isOutdoors);
        System.out.println(hobbyList2);




    }
}

/*
 Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
 */