package BasicQuestion;

public class reverseanumber {
//    public static void main(String[] args) {
//        int n = 1351;
//        rev(n);
//        System.out.println(sum);
//    }
    // doubt in this way
//    public static int rev(int n){
//        if(n==1){
//            return 1;
//        }
//        int rem = n%10;
//          System.out.print(rem);
//        return rem +rev(n/10);
//    }
    static int sum = 0;
    public static void rev(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum *10 + rem;
        rev(n/10);

    }
    public static int rev2(int n ){
        int digits = (int)(Math.log10(n)+1);
        return helperfuntion(n , digits);
    }
    private static int helperfuntion(int n ,int digit){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digit -1)) * helperfuntion(n/10 , digit -1);
    }

    public static void main(String[] args) {
        int n = 2525;
        rev2(n);
        System.out.println(n);
    }
}
