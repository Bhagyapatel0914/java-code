// Also find pelendrome number between 100 to 1000 same as angstrome number to find it !!
import java.util.*;
public class pelendrome{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Input the number to check whether it is pelendrome or not = ");
        int n = sc.nextInt();
        pele(n);
    }
    public static void pele(int n){
        int dup = n;
        int sum = 0;
        int rem;
        while(n>0){
            rem = n %10;
            n = n / 10 ;
            sum = sum*10 + rem;
        }if(sum == dup ){
            System.out.println("The number is pelendrome ");
        }else{
            System.out.println("The number is not pelendrome ");
        }
    }
}