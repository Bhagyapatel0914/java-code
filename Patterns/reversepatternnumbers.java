import java.util.*;
public class reversepatternnumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input = ");
        int n = sc.nextInt();
      for(int i = n ; i>=1 ; i--){
        for(int j = 1; j<=i ;j++){
            System.out.print(j);
     }
        System.out.println();
      }
    }
}