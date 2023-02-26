import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Butterfly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input = ");
        int n = sc.nextInt();
       // upper part 
       for(int i = 1 ; i<=n ;i++ ){
        // stars
        int space = 2*(n-i);
        for(int j = 1 ;j<=i;j++ ){
            System.out.print("*");
        }
        // spaces
        for(int j = 1; j<= space ; j++){
            System.out.print(" ");
        }
        // star
        for(int j = 1 ; j<=i ;j++){
            System.out.print("*");
        }
        System.out.println();
       }
        // lower part 
        for(int i = n ; i>=1 ;i-- ){
            // stars
            int space = 2*(n-i);
            for(int j = 1 ;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<= space ; j++){
                System.out.print(" ");
            }
            // star
            for(int j = 1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
           }
    }
}
