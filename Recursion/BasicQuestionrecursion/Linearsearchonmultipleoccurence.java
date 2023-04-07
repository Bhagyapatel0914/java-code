package BasicQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class Linearsearchonmultipleoccurence {
    public static void main(String[] args) {
     int [] arr ={1,2,3,4,4,8,9};
     int target = 4;
     multiint(arr,0,target);
        System.out.println(list);

    }
    static ArrayList<Integer>list = new ArrayList<>();
    public static void multiint(int [] arr ,int i , int target){
        if(i == arr.length){
            return ;
        }
        if(target == arr[i]){
            list.add(i);
        }
         multiint(arr,i+1,target);
    }
}
