import java.util.Arrays;
public class MAX {
    public static void main(String[] args) {
       int [] arr = {20,30,10,17,1,8,14};
       max(arr);
    }
     public static void max(int [] arr){
        int max = arr[0];
        for (int i =0 ; i< arr.length-1;i++){
            if(arr[i]>arr[0]){
                max = i;
            }
        }
         System.out.println(arr[max]);
     }
}