package Stack;

public class OwnStack {
    protected int [] arr;
    private static final int default_size = 10;

    public OwnStack() {
        this(default_size);
    }

    public OwnStack(int size) {
        this.arr =new int[size];
    }
    int pointer = -1;
    public boolean push(int item)  {
        if(isfull()){
            System.out.println("The stack is full");
            return false;
        }
        pointer++;
        arr[pointer] = item;
        return true;
    }
    // This will take O(n) time while removal
    public int pop() throws Exception {
        if(isempty()){
            throw new ownstackexeption("Stack is empty nothing to remove");
        }
        return arr[pointer--];
    }
    public int peak() throws Exception {
        if (isempty()){
            throw new ownstackexeption("The stack is empty");
        }
        return arr[pointer];
    }

    public boolean isempty() {
        return pointer == -1;
    }

    public boolean isfull() {
        return pointer == arr.length -1;
    }
}
