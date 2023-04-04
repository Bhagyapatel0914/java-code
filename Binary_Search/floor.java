// return largest number smaller than number searching for
public class floor {
    public static void main(String[] args) {
        int [] arr = {20 , 122,133,144,188,1000,11111};
        int target = 18;
        // also try for
        // int target = 134;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    public static int floor(int [] arr , int target){
        int start = 0 ;
        int end = arr.length-1;
        // if number is smaller than smallest number in array for that
        if (target < arr[0]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end  -  start )/2;
            if(target > arr[mid]){
                start = mid +1;
            }
            else if(target<arr[mid]){
                end = end- 1;
            }else{
                return mid;
            }
        }
        return end;
        }
    }

