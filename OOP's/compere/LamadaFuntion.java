package compere;

import java.util.ArrayList;

public class LamadaFuntion {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            arr.add(i*2);
        }
        System.out.println(arr);
        // We can also do something like this
        // This is the lamada funtion
        arr.forEach((item)-> System.out.println(item));
        Operation sum = ( a, b) -> a+b;
        Operation sub =  (a,b)-> a -b;
        Operation divide = (a,b) -> a/b;
        LamadaFuntion cal = new LamadaFuntion();
        System.out.println(cal.operate(2,3,sum));
        System.out.println(cal.operate(2,3,sub));
        System.out.println(cal.operate(2,3,divide));
    }
    private int operate(int a , int b, Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a , int b);
}