package generics;

import java.util.Arrays;
import java.util.List;

// If we do something like this I extends we can only access the number class and it's sub class
// like the float , integer and many other but we cannot do like <String>
public class wildcard<I extends Number> {
    private Object [] arr ;
    private int deefault_size = 10;
    private int size = 0;
    public wildcard() {

        this.arr = new Object[deefault_size];
    }
    public void add(I num){
        if(isfull()){
            increasethesize();
        }
        arr[size++] = num;
    }
    public I remove(){
        I remove = (I)(arr[--size]);
        return remove;
    }
    public void set(int index ,  I valueindex){
        arr[index] = valueindex;
    }
    public I  getindex(int num){
        return (I)arr[num];
    }
    public int size(){
        return size;
    }
    private void increasethesize() {
        Object [] temp = new Object[2*deefault_size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp = arr;
    }
    private boolean isfull() {
        return arr.length == size;
    }
    @Override
    public String toString() {
        return "creatingarraylist{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
    public static void main(String[] args) {
        wildcard<Integer> list = new wildcard<>();
        list.add(12);
        System.out.println(list);
       // wildcard<String>list2 = new wildcard<>();
        // hence here as we tried to add the string in the
        // one extends the Number class ,we can only add subclass of number
        wildcard<Float> list2 = new wildcard<>();
        list2.add(12.23f);
        System.out.println(list2);
        // Hence we can add types of all subclassses
    }
    // here in the below case we can only add the number type we  cannot access
    // the float or anything else
    public void getlist(List<? extends Number> List){
        // perform task
    }
}
