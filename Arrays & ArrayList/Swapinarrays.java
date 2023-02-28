import java.util.Arrays;
public class Swapinarrays {
    public static void main(String[] args) {
       int [] arr = {20,30,10,17,1,8,14};
        swapped(arr,0,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swapped(int [] arr , int start ,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}