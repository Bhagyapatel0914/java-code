import java.util.Arrays;
public class swaparray {
    public static void main(String[] args) {
       int [] arr = {20,30,10,17,1,8,14,12};
       swap(arr);
    }
     public static void swap(int [] arr){
       int start = 0;
       int end = arr.length-1;
       while(end>start){
           int temp=  arr[start];
           arr[start] = arr[end];
           arr[end] = temp ;
           start ++ ;
           end --;
       }
         System.out.println(Arrays.toString(arr));
     }
}