package BasicQuestion;

public class multipicationofnnumbers {
    public static void main(String[] args) {
       int n =5;
       int ans = get(n);
        System.out.println(ans);
    }
    public static int get(int n){
        if(n == 1){
            return 1;
        }
        return n*get(n-1);
    }
}
