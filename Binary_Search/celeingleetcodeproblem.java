public class celeingleetcodeproblem {
    public static void main(String[] args) {
        char [] arr = {'c','f','j'};
        char target = 'g';
        char ans = leetcode(arr , target);
        System.out.println(ans);
    }
    public static char leetcode(char [] arr , char target){
        int start = 0;
        int end = arr.length-1;
      // wrap code
        if(target > arr[arr.length-1]){
            return arr[0];
        }
        while(start <= end){
            int mid = start + (end - start )/2;
            if(target > arr[mid] ){
                start = mid +1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
