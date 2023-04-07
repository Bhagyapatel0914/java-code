package BasicQuestion;

public class nto1numbers {
    public static void main(String[] args) {
        int n = 5;
        getnumber(n);
    }
    public static void getnumber(int n){
        // Base condition
        if(n == 0){
            return ;
        }
        //Body of Recursive program
        System.out.println(n);
        getnumber(n-1);
    }
}
