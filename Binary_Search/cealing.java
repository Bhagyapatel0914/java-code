public class cealing {
    public static void main(String[] args) {
        int [] arr = {20 , 122,133,144,188,1000,11111};
        int target = 11112;
        // try also for
        // int target = 145;
        int ans = cealing(arr , target);
        System.out.println(ans);
    }
    public static int cealing(int [] arr , int target){
        // cealind means smallest number greater than target
        // if target is largest number in array
        int start = 0;
        int end = arr.length-1;
        if (target > arr[arr.length-1]){
            return -1 ;
        }

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else{
                return mid;
            }
        }
        return start ;
    }
}
