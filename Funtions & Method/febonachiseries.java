import java.util.*;
public class febonachiseries{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number upto which you want to print febonachi series = ");
        int n = sc.nextInt();
        febo(n);
    }
    public static void febo(int n ){
        int a  = 0;
        int b = 1;
        System.out.print( a +" "+ b);
        for(int i = 2 ; i<n ;i++){
            int temp = a;
            a = b ;
            b = temp;
            b = a+b ;
            System.out.print(" "+b);
        }
    }
}