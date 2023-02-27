// Funtion call directly
// In method we call via object of funtion
// In java there is only pass by value not pass by reference
// It is used for general task so we dont have to write a code multiple time for ex : sum of two numbers
import java.util.*;
public class funtion{
    public static void main(String[] args){
        sumofnumbers();
    }
    public static void sumofnumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first numbers  = ");
        int a = sc.nextInt();
        System.out.print("Input the second numbers  = ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.print("The sum of two number is = "+ c);
    }
}
