import java.util.*;
public class nfebonachinumber{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number to find nth febonachi term = ");
        int n = sc .nextInt();
        febon(n);
    }
    public static void febon(int n){
        int a =0;
        int b = 1;
        int count = 2;
        while(count<n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println("The nth febonachi term is = "+b);
    }
}