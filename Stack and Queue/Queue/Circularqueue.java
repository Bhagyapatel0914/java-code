package Queue;

public class Circularqueue {
       protected int [] arr;
       public static final int Default_size = 10;
    public Circularqueue() {
        this(Default_size);
    }
    public Circularqueue(int size) {
        this.arr = new int[size];
    }
   protected int end =0;
    protected int front = 0;
    private int size = 0;
    private boolean isempty() {
        return size == 0;
    }
    private boolean isfull() {
        return size == arr.length ;
    }
    public boolean push(int item){
        if (isfull()){
            System.out.println("queue is full");
            return false;
        }
        arr[end++] = item;
        end = end % arr.length;
        size++;
        return true;
    }
    public int pop() throws Exception {
        if (isempty()){
            throw new Exception("The queue is empty");
        }
        int removed = arr[front++];
        front  = front % arr.length;
        size--;
        return removed;
    }
    public int peak(){
        return arr[front];
    }
    public void display(){
        int i = front;
        do{
            System.out.print(arr[i]+" ");
            i++;
            i = i% arr.length;
        }while (i != end);
        System.out.println();
    }
}
