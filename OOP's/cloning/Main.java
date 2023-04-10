package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Humanbeings bhagya = new Humanbeings(21,"bhagya");
        // doing this is the time consuming hence the clone method in
        // in object class is used to create the copy
//        Humanbeings twin = new Humanbeings(bhagya);
//        System.out.println(twin.age);
        Humanbeings twin = (Humanbeings)bhagya.clone();
        System.out.println(twin.age+" "+twin.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 20 ;
        System.out.println(Arrays.toString(twin.arr));
        // what if i do bhagya.arr then  the bhagya.arr is also changed
        // this thing is called shallow copy
        System.out.println(Arrays.toString(bhagya.arr));
        // to overcome this loophole we can do something called deep copy
        // in which the new object created int the heap aand that wwill modify only
//

        // now lets try for deep copy
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 22;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(bhagya.arr));
        // here only the twin change because mutilple object
        // created where in case of the shallow copy all the
        // references pointing towards the same object
    }
}
