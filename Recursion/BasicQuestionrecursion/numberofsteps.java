package BasicQuestion;

public class numberofsteps {
    public static void main(String[] args) {
        int n = 14;
        int ans = csetps(n);
        System.out.println(ans);
    }
      static   int stepstaken = 0;
    public static int csetps(int n){
        if(n%2==n){
            return n ;
        }
        int rem = n%2;
        if(rem % 2 != 0){
            stepstaken++;
            rem = rem - 1;
            stepstaken++;
        }else{
            stepstaken++;
        }
        return stepstaken + csetps(n/2);
    }
}
