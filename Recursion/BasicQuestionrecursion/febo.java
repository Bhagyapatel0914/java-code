package BasicQuestion;

public class febo {
    public static void main(String[] args) {
        int ans = feb(6);
        System.out.println(ans);

    }
    static int feb(int n ){
        if(n<2){
            return n;
        }
        return feb(n-1)+feb(n-2);
    }
}
