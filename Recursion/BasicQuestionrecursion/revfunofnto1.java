package BasicQuestion;

public class revfunofnto1 {
    public static void main(String[] args) {
        int n = 5;
        getnumbers(n);
    }
    public static void getnumbers(int n){
        if(n == 0){
            return ;
        }
        getnumbers(n-1);
        System.out.println(n);
    }
}
