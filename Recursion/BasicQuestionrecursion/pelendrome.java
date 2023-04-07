package BasicQuestion;

public class pelendrome {
    public static int pele(int n){
        int digit = (int)Math.log10(n)+1;
        return helper(n ,digit);
       }
    public static int helper(int n , int digits){
           if(n%10 == n){
               return n;
           }
        int rem = n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10 ,digits-1);
       }
       public static boolean peledromes(int n){
        if(n  == pele(n)){
            return true;
        }
        return false;
       }
    public static void main(String[] args) {
        System.out.println(peledromes(123321));
    }
}


