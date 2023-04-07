package BasicQuestion;

import java.util.ArrayList;

public class returnarraylistwithoutaddingittoargument {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,4,8,9};
        int target = 4;
        System.out.println(withoutarg(arr,target,0));
    }
    public static ArrayList<Integer> withoutarg(int [] arr ,int target ,int i){
       ArrayList<Integer>list = new ArrayList<>();
        if(i == arr.length){
            return list;
        }
        if(arr[i]==target){
           list.add(i);
        }
        ArrayList<Integer>ansfrombelow =  withoutarg(arr,target,i+1) ;
        list.addAll(ansfrombelow);
        return list;
    }
}
