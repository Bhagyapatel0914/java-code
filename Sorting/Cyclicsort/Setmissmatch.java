import java.util.Arrays;

public class Setmissmatch {
    public static void main(String[] args) {
//        int [] arr = {1,2,2,4};
        int [] arr = {1,1};
        System.out.println(Arrays.toString(miss3(arr)));
    }
    public static int[] miss3(int [] arr){
        int i = 0 ;
        while(i< arr.length){
            int corr = arr[i] - 1;
            if( arr[corr]!=arr[i]){
                swap(arr,corr,i);
            }
            else{
                i++;
            }
        }
        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index]!= index +1){
                return new int []{arr[index],index+1} ;
            }
        }
        return new int []{-1,-1};
    }
    public static void swap(int [] arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
