package DoublyLinkedList;

public class DL {
    private Node head;
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev = node;
        }
        head = node;
    }
    public void insertlast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;
        // null pointer exeption
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while (node !=null){
            System.out.print(node.val+ "-->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
    }
    public Node find(int val){
        Node node = head;
        while (node!= null){
            if (val == node.val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insert(int after , int val){
        Node p = find(after);
        if (p == null){
            System.out.println("Not exist");
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }
    public class Node{
        int val ;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
