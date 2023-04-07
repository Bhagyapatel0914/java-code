package BasicQuestion;

public class numberofzeros {
    public static void main(String[] args) {
        int n = 30210004;
        int ans = zero(n);
        System.out.println(ans);
    }
    public static int zero(int n){
        int numberofzero = 0;
        if(n == 0){
         return 0;
        }
        int rem = n%10;
        if(rem == 0){
            numberofzero++;
        }
        return numberofzero + zero(n/10);
    }
}
