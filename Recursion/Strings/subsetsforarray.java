package Strings;
import java.util.*;
public class subsetsforarray {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        for (List<Integer> list : ans){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> subsets(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int nums : arr){
            int n = outer.size();
            for(int i = 0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);
            }
        }
        return outer;
    }
}
