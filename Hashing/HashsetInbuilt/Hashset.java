package HashsetInbuilt;
import java.util.*;
// This data structure is  the time efficient O(1) and it follow  the  property
// of the set like one element appeares one only
// but there is no proper order that it will print the thing in the order in which
// we added the item
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(37);
        set.add(1);
        System.out.println(set);
         if (set.contains(3)){
             System.out.println("It contains the element");
         }else{
             System.out.println("It doesn't contain element ");
         }
        // There are two important funtion called hasnext and has
        set.remove(1);
        System.out.println(set);
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
