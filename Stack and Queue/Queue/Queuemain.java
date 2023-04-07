package Queue;

public class Queuemain {
    public static void main(String[] args) throws Exception {
        ownqueue que = new ownqueue(5);
        que.push(10);
        que.push(101);
        que.push(1011);
        que.push(20);
        que.push(102);
       // que.push(10111);

        // System.out.println(que.peek());


        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());
       // System.out.println(que.pop());

    }
}
