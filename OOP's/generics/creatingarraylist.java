package generics;

import java.util.Arrays;
// Now all this is good to go but here in these case we can add only the integer type
// of data only while can see in the arraylist provide by the developers we can add character strings
// and many more do to this thing the geneics play in the role
public class creatingarraylist {
    private int [] arr;
    private static int Default_size = 10;

    private int size = 0;

    public creatingarraylist() {
        this.arr = new int[Default_size];
    }

    public void add(int num){
        if(isfull()){
            increasesize();
        }
        arr[size++] = num;
    }
    public int remove(){
        int remo = arr[--size];
        return remo;
    }
    public int get(int index){
        return arr[index];
    }
    public int size(){
        return size;
    }
    public void set(int index , int indexval){
        arr[index] = indexval;
    }

    private void increasesize() {
        int [] temp = new int[2*arr.length];
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
        creatingarraylist list = new creatingarraylist();
//        list.add(3);
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            list.add(2*i);
        }
        System.out.println(list);
    }
}
