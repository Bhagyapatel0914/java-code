package cloning;

public class Humanbeings implements Cloneable {
    int age;
    String name ;
    int [] arr;

    public Humanbeings(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,2,5,8};
    }

//    public Humanbeings(Humanbeings other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

//    public Object clone() throws CloneNotSupportedException{
//        // this is  the shallow copy
//        return (Humanbeings)super.clone();
//        // By shallow copy means we are mofifying the old one only
//    }
       public Object clone() throws CloneNotSupportedException{
        // this is the deep copy
        Humanbeings twin = (Humanbeings) super.clone(); // this thing is actually shallow copy
        twin.arr = new int[twin.arr.length];
           for (int i = 0; i <twin.arr.length; i++) {
           twin.arr[i] = this.arr[i];
           }
           return twin;
    }
}