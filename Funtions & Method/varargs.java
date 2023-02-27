import java.util.Arrays;
// Always ..v comes at last for explaination check notes
public class varargs{
//    public static void main(String []args){
//        var(2,3,4,5,6,7,8,9);
//    }
//    public static void var(int ...v){
//        System.out.println(Arrays.toString(v));
//    }
public static void main(String[] args) {
    a(12,13,"bhagya","how are you");
}
 public static void a(int a , int b , String ...v){
     System.out.println( a +" "+  b + Arrays.toString(v));
 }
}