public class binarysearchdecending {
    public static void main(String[] args) {
        int [] arr =  {3000 , 20 , 10 , -4 , -8};
        int target = -4;
        int ans = decend(arr , target);
        System.out.println(ans);
    }
    public static int decend(int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(target > arr[mid]){
                end = mid - 1;
            } else if(target < arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }

}
