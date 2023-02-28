// concept of taking input a array
import java.util.*;
public class Inputin1Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        // INPUT
        for(int i = 0 ; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // OUTPUT
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));
    
}    
}
