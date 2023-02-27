import java.util.*;
public class angstromnumber{
    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input the number to check whether it is angstrom or not = ");
//        int n = sc.nextInt();
//        ang(n);
        // finding angstrom number
        for(int i = 100 ;i<1000;i++){
            if(ang(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean ang(int n ){
        // here we store n in duplicate variable because value of n deacrese by 10 every time
        int dup = n ;
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }

//        if(dup == sum){
//            System.out.println("The number you input is angastrom");
//        }else{
//            System.out.println("The number you input is not angastrom");
//        }
        return sum == dup;
    }
}