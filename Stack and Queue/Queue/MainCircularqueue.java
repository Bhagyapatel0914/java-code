package Queue;

public class MainCircularqueue {
    public static void main(String[] args) throws Exception {
        Circularqueue que = new Circularqueue(5);
        que.push(20);
        que.push(27);
        que.push(28);
        que.push(21);
        que.push(22);
       // que.push(28);
       que.display();

     que.pop();
     que.display();
     que.push(21);
     que.display();
        System.out.println(que.peak());;

      //  System.out.println(que.peak());

//        System.out.println(que.pop());
//        System.out.println(que.pop());
//        System.out.println(que.pop());
//        System.out.println(que.pop());
//     //   System.out.println(que.pop());
    }
}
