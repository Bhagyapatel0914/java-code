package sorting;

import java.util.Arrays;

public class selectionsort{
    public static void main(String[] args) {
     int [] arr = {3,4,2,1};
     sel(arr, arr.length-1,0,0 );
        System.out.println(Arrays.toString(arr));
    }
    public static void sel(int [] arr ,  int r ,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[max]<arr[c]){
                sel(arr,r,c+1,c);
            }else{
                sel(arr,r,c+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;
            sel(arr,r-1,0,0);
        }
    }
}