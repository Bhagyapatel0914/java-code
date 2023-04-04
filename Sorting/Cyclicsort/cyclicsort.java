import java.util.Arrays;

// this sortbis used when number givan from 1 to n
public class cyclicsort {
    public static void main(String[] args) {
        int [] arr = {3,2,1,6,5,9,4,8,7};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic(int [] arr){
     int i = 0;
     while(i< arr.length){
         int corr = arr[i] - 1;
         if(arr[corr] != arr[i]){
             swap(arr , corr , i);
         }else{
             i++;
         }
     }
    }
    public static void swap(int [] arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
