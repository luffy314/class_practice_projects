package office_hours.day10;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class P01_ListPractice {
    public static void main(String[] args) {

        Integer[] nums={1,2,3,4,5,4,3,2,1};


        System.out.println(" --- ARRAYLIST ---");

        ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(nums));
        System.out.println(arraylist);
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.size());


        System.out.println(" --- LINKEDLIST  ---");

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(nums));
        System.out.println(linkedList);
        linkedList.addFirst(0);
        linkedList.addLast(100);
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("linkedList.getLast() = " + linkedList.getLast());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList);

        System.out.println(" --- VECTOR  ---");
        Vector<Integer> vector = new Vector<>(Arrays.asList(nums));
        System.out.println(vector);
        System.out.println("vector.get(0) = " + vector.get(0));
        System.out.println(vector.size());
        vector.add(10);
        vector.remove(9);
        vector.remove(8);
        System.out.println("-------");
        System.out.println(vector);


        System.out.println(" --- STACK  ---");
        // new Stack<>(Arrays.asList(nums))  There is no constructor that accepts List.
        /*
            List<Integer> list = new Stack<>();
            list.pop();
            list.push();
            Reference type will decide which methods are accessible
            ((Stack) list).push();

         */



        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(nums));
        System.out.println(stack);
        System.out.println(stack.get(0));
        System.out.println(stack.size());
        System.out.println(stack.search(5));


        //push()
        stack.push(10);

        System.out.println(stack);

        // pop()
        Integer a = stack.pop();  // remove last element from stack and returns it
        System.out.println(a);

        System.out.println("---- Difference between add() and push() ----- ");
        System.out.println(stack.add(11));         // true
        System.out.println(stack.push(12));   // 12

        System.out.println(stack);

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
        System.out.println("======================");


        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop()+" ");
        }

        System.out.println(stack.empty());


    }
}
