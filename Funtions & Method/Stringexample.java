import java.util.*;
public class Stringexample{
    public static void main(String[] args){
        greet();
    }
    public static void greet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the name = ");
        String str = sc.nextLine();
        System.out.print("Hi " +str +" welcome to Bhagya Github" );
    }
}