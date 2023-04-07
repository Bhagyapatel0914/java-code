package BasicQuestion;

import java.util.ArrayList;

public class returnArraylist {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,4,8,9};
        int target = 4;
        System.out.println(ret(arr,target,0,new ArrayList<>()));
    }
    public static ArrayList<Integer> ret(int [] arr ,int target ,int i ,  ArrayList<Integer>list){
       // Base condition
        if(i == arr.length){
            return list ;
        }
        if(target == arr[i]){
            list.add(i);
        }
        return ret(arr,target,i+1,list);
    }
}
