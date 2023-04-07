package SinglyLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {

        this.size = 0;
    }
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }
    public void insertlast(int val){
        if(tail == null){
           insertfirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int index , int val){
        if(index == 0){
            insertfirst(val);
            return;
        }
        if (index == size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }
    public int delefirst(){
        int val = head.value;
        head = head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int delelast(){
        if (size<=1){
            delefirst();
        }
        Node secondlast = get(size -2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index == 1){
            delefirst();
        }
        if (index == size-1){
            delelast();
        }
        Node node = head;

        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    private Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
            return node;
    }
    public  Node find(int value){
        Node node  = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // we have to store the head as the temp variable
    //  because if we change the head hence at last
    // it finally became the null hence we change the whole data
    // structure
    public void display(){
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        private int value;
        private Node next;
        private int size;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }


}
