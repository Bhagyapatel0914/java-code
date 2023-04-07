package BasicQuestion;

public class Binaryseearch {
    public static void main(String[] args) {
        int [] arr = {10,20,60,40,80};
        int ans = bs(arr ,0, arr.length -1,20);
        System.out.println(ans);
    }
    public static int bs(int [] arr , int s,int e , int target ){
       if(s>e){
           return -1;
       }
        int m = s + (e-s)/2;
        if(target == arr[m]){
            return m;
        }
        if(target>arr[m]){
            return bs(arr ,m+1, arr.length -1,target);
        }
        return bs(arr ,s,m-1,target);
    }
}
