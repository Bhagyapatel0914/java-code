package BasicQuestion;

public class getsumofdigits {
    public static void main(String[] args) {
        int n = 500;
        int ans = digi(n);
        System.out.println(ans);
    }
    public static int digi(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        return rem + digi(n/10);
    }
}
