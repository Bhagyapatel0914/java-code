package Basics;
public class Wrapper {
    public static void main(String[] args) {
        // it is primitive hence a. more option are not available
        int a  = 10; // there is no object in heap as it is non primitive
        int b  = 20; // Integer is used which create object let see what happens
        // this is object hence more dot option available
        Integer num1 = 10;
        Integer num2 = 20;
        // if we call swap funtion it will not swap the a and b
        // because in java there is no pass by reference there is only pass by value
        swap(a,b);
        System.out.println(a +" "+b);
        // Let's call swapp and see what will happens
        swapp(num1,num2);
        System.out.println(num1+" "+num2);
        // it will not swapped because Integer is consist of final call
        A ans = new A();
        int num = 21;
        System.out.println(ans.num);
        // it will print because of final class
        A obj = new A();
        for (int i = 0; i < 10000000; i++) {
            obj= new A();
        }
    }
    public static void swap(int a ,int b){
         int temp = a ;
         a = b;
         b = temp;
    }
    public static void swapp(Integer a ,Integer b){
        Integer temp = a ;
        a = b;
        b = temp;
    }
}
class A{
    final Integer num = 20;
// To avoid Garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is removed");
    }
}