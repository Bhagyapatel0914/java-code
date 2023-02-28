// concept of taking input a 2D array
import java.util.*;
public class Inputin2Darrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int [][] arr = new int [3][3];
       //INPUT
        for(int i = 0; i< arr.length;i++){
            for(int j = 0 ; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        //OUTPUT
//        for(int i = 0; i< arr.length;i++){
//            for(int j = 0 ; j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//        }
        //OUTPUT BETTER ALTERNATIVE
        for(int i = 0; i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
// Also try this with enhanced for-loop;
