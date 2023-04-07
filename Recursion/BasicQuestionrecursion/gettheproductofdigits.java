package BasicQuestion;

public class gettheproductofdigits {
    public static void main(String[] args) {
        int n = 500;
        int ans = pro(n);
        System.out.println(ans);
    }
    public static int pro(int n){
        // if one digit remain return itself
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * pro(n/10);
    }
}
