package sorting;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4,5};
        sorted(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sorted(int [] arr , int low ,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        // Pivot element
        int m = s+(e-s)/2;
        int p = arr[m];
        while (s<=e){
            while(arr[s]<p){
                s++;
            }
            while(arr[e]>p){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sorted(arr,low,e);
        sorted(arr,s,high);
    }
}

