package Queue;

public class Dynamicqueue extends Circularqueue{
    public Dynamicqueue() {
        super();
    }
    public Dynamicqueue(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        int [] temp = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(front + i)% arr.length];
        }
        front = 0;
        end = arr.length;

        return super.push(item);
    }
}
