package Stack;

// Time complexity is O(n) .
// or amotized time constant .
public class ownDynamicstack extends OwnStack {
    public ownDynamicstack() {
        super(); // this will call one with no argument in parent class
    }

    public ownDynamicstack(int size) {
        super(size); // this will call one with argument in parent class
    }
    public boolean push(int item){
        if (this.isfull()){
            int [] temp = new int[arr.length *2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            temp = arr; // here array is copied
        }
        return super.push(item);
    }
}
