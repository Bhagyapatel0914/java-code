import java.util.ArrayList;
import java.util.List;

public class Findallsuplicatenumber {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(dup2(arr));
    }
    public static List<Integer> dup2(int [] arr){
        int i = 0 ;
        while(i< arr.length){
            int corr = arr[i] - 1;
            if(arr[corr]!= arr[i]){
                swap(arr , corr , i);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index]!= index + 1){
             ans.add( arr[index]);
            }
        }
        return  ans;
    }
    public static void swap(int [] arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
