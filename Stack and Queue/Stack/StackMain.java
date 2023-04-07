package Stack;

import Stack.OwnStack;
import Stack.ownDynamicstack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        OwnStack stack = new ownDynamicstack();
        stack.push(20);
        stack.push(12);
        stack.push(22);
        stack.push(21);
        stack.push(211);
        stack.push(122);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.peak()); --> 211

    }
}
