// taking input in 1Darray list
import java.util.*;
public class Inputin1Darraylist{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>(3);
        // INPUT
        for(int i = 0 ; i<3 ; i++){
           list.add(sc.nextInt());
        }
        // OUTPUT
        System.out.println(list);
    }
}