// concept of swapping
import java.util.*;
public class swapped{
    public static void main(String []args){
        swap();
    }
    public static void swap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number a = ");
        int a = sc.nextInt();
        System.out.print("Input the first number b = ");
        int b = sc.nextInt();
        int temp  = a;
        a = b;
        b = temp;
        System.out.print("The after swappin is : "+ "a = "+ a + " b = " + b );
    }
}