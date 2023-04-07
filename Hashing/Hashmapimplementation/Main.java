package Hashmapimplementation;

import java.util.ArrayList;

public class Main extends implementation{
    public static void main(String[] args) {
        HashMap <String,Integer> list = new HashMap<>();
        list.put("bhagya",12);
        list.put("bhagy",13);
        list.put("bhag",12);
        System.out.println(list.get("bhagya"));
        System.out.println(list.contain("bhag"));
      //  System.out.println(list.remove("bhagya"));
        System.out.println(list.keyset());
        ArrayList<String> list1 = list.keyset();
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)+" = "+list.get(list1.get(i)));
            //  Here one important thing to note  we made the list1 as string
            // Now by list1.get(i) = string and by list.get(string) = value of that string
        }
    }
}
