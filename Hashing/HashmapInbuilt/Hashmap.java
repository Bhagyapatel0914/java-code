package HashmapInbuilt;
// Time complexity : O(1) constant
// There in no fix order of execution
import java.security.Key;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> info = new HashMap<>();
        info.put("India" , 120);
        info.put("china",140);
        info.put("Malaysia",18);
        System.out.println(info);
        if (info.containsKey("Malaysia")) {
            System.out.println("key is present");
        }else {
            System.out.println("Not present");
        }
        info.put("India" , 140);
        // value for the been updated
        System.out.println(info);
        System.out.println(info.get("china"));
        // it will give the value of the key china
        // L.H.S is the type of the value which we pick up from info set
        for (Map.Entry<String,Integer> e : info.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Alternative way to do above thing
        Set<String> list = info.keySet();
        for (String valkeys : list ){
            System.out.println( valkeys + " " + info.get(valkeys));
        }
    }
}
