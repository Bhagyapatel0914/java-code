// Arraylist has provide larger size as compare to arrays
// Syntax-->   ArrayList<datatype>list = new ArrayList<datatype>(intial size);
import java.util.*;
public class ArrayListint1D{    
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>(10);
        // Here the size is 10 but there are 11 element it will print all of them
        // because internal working multiply its size when morre than half of
        // size we inputed reaches
        list.add(95);
        list.add(90);
        list.add(70);
        list.add(60);
        list.add(678);
        list.add(685);
        list.add(707);
        list.add(0);
        list.add(627);
        list.add(6);
        list.add(678);
        System.out.println(list);
        System.out.println(list.contains(678));
        System.out.println(list.remove(0));
        list.set(0,98);
        System.out.println(list);
    }
    }
