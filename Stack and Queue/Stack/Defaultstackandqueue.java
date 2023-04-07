package Stack;

import java.util.*;

public class Defaultstackandqueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(37);
        stack.push(8);
        stack.push(78);
        stack.push(21);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // Lets say if we remove when everything is removed
       // System.out.println(stack.pop());
        // it throws an exeption

        // As the internally queue is the interface hence we cannot do
        // something like new Queue<>(); hence we use ll because
        // as the linklist also follow the algorithm of first in first out and it is
        // the class
        Queue<Integer> queue = new LinkedList<>();
        queue.add(40);
        queue.add(4);
        queue.add(32);
        queue.add(78);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Array deque is more faster than the queue used as the ll becaause its allow us too delete
        // or add from the both the side
        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(29);
        deq.add(82);
        System.out.println(deq.peek());
        deq.addFirst(85);
        System.out.println(deq.peek());
    }
}