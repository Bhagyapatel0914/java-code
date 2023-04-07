package BasicQuestion;

public class sortedArray {
    public static void main(String[] args) {
//        int [] arr = {1,2,4,8,9,12,7};
        int [] arr = {1,2,4,8,9,12};
        boolean ans =  sort(arr,0);
        System.out.println(ans);
    }
    public static boolean sort(int [] arr , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return sort(arr,i+1);
        }
        return false;
    }
}
