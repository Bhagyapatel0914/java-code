import java.util.*;
public class HollowRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input = ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ;i++){
            for(int j = 1 ; j<=n ;j++){
                if(i==1 || i==n ||j==n || j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }       
    }
}