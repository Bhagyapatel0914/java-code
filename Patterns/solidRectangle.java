import java.util.*;
public class solidRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input = ");
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            for(int j =0 ; j<n ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}