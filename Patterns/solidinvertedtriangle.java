import java.util.*;
public class solidinvertedtriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input = ");
        int n = sc.nextInt();
        // upper half
        for(int i = 1; i<= n ; i++){
            for(int j = n-i ; j>=1 ; j--){
                System.out.print(" ");
            } for(int j = 1 ; j<= i ; j++){
                System.out.print("*");
            } for(int j = 2 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i = n; i>= 1 ; i--){
            for(int j = n-i ; j>=1 ; j--){
                System.out.print(" ");
            } for(int j = 1 ; j<= i ; j++){
                System.out.print("*");
            } for(int j = 2 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}