import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int [] arr = {1,8 ,6,4,18,12};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int [] arr){
        for(int i = 0 ; i< arr.length; i++){
            int end = arr.length-1-i;
            int max = maxint(arr , 0 ,end);
            swap(arr , max  ,end );
        }
    }
    public static int maxint(int [] arr, int start ,  int end ){
        int max = start;
        for(int i = start ; i<= end ;i++){
            if(arr[max]<arr[i]){
                max = i ;
            }
        }
        return max;
    }
    public  static void swap(int [] arr , int  maxi  , int end  ){
        int temp = arr[maxi];
        arr[maxi] = arr[end];
        arr[end] = temp;

    }
}
