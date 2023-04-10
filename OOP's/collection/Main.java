package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // List is the one type of the collection frame work
        // similar to it there is a linkedlist and the vector
        list.add(12);
        System.out.println(list);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(21);
        System.out.println(list2);
        // also there is one more collection frame work know as the vector
        // but it work on the multti threading hence it is quite slow
        // as  compare to the ArrayList<>
        Vector<Integer> list3 = new Vector<>();
        list3.add(28);
        System.out.println(list3);
    }
}
// There are many more