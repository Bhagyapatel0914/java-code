package Queue;

public class ownqueue {
    protected int [] arr;
    private static final int Default_size = 10;

    public ownqueue() {
      this(Default_size);
    }

    public ownqueue(int size) {
        this.arr = new int[size];
    }
    int pointer = -1;
    public boolean push(int item){
        if (isfull()){
            System.out.println("queue is full");
            return false;
        }
        pointer++;
        arr[pointer] = item;
        return true;
    }
    public int pop() throws Exception {
        if (isempty()){
            throw new Exception("The queue is empty");
        }
        int removed = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        pointer--;
        return removed;
    }
    public int peek() throws Exception {
        if (isempty()){
            throw new Exception("The queue is empty");
        }
        return arr[0];
    }

    private boolean isempty() {
        return pointer == -1;
    }

    private boolean isfull() {
        return pointer == arr.length - 1;
    }
}
