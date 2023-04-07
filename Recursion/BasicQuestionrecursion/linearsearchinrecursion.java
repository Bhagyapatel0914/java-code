package BasicQuestion;

// Also write program for checking index from last ans also in boolean datatype.
public class linearsearchinrecursion {
    public static void main(String[] args) {
        int [] arr = {3,2,1,18,9};
        int target = 9;
        int ans = linearsearch(arr ,0,target);
        System.out.println(ans);
    }
    public static int linearsearch(int [] arr ,int i , int target){
       // Base condition
        if(i == arr.length){
            return -1;
        }
//        // Base condition
//        if(target == arr[arr.length-1]){
//            return arr.length-1;
//        }
        if(target != arr[i]){
            return linearsearch(arr ,i+1 ,target);
        }
        return i;
    }

}
