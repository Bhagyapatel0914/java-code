// taking input in 2Darray list
// Syntax of 2D arraylist -->
import java.util.*;
public class Inputin2Darraylist{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // Initialize arraylist
        for(int i= 0 ; i< 3 ;i++){
            list.add(new ArrayList<>());
        }

        // INPUT
        for(int i = 0 ; i<3 ; i++){
         for(int j = 0 ; j<3 ;j++){
             list.get(i).add(sc.nextInt());
         }
        }
        // OUTPUT
        System.out.println(list);
    }
}