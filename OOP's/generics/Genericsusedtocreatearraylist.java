package generics;

import java.util.ArrayList;
import java.util.Arrays;
// Here lets introduce the Generics
public class Genericsusedtocreatearraylist<I> {
    private Object [] arr ;
    private int deefault_size = 10;
    private int size = 0;
    public Genericsusedtocreatearraylist() {

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
        Genericsusedtocreatearraylist<Integer> list = new Genericsusedtocreatearraylist<>();
        list.add(12);
        System.out.println(list);
        // here we can add anything
        Genericsusedtocreatearraylist<String>list2 = new Genericsusedtocreatearraylist<>();

    }
}