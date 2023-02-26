import java.util.*;
public class Reflictedpyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input = ");
        int n = sc.nextInt();
        // spaces
        for(int i =1; i<=n ;i++){
            for(int j = n-i; j>=0 ;j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}