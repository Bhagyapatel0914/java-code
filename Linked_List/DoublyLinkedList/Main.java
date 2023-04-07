package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DL list = new DL();
        list.insertfirst(12);
        list.insertfirst(120);
        list.insertfirst(1200);
        list.insertfirst(120000);
        list.display();
        list.insertlast(200);
        list.display();
        System.out.println(list.find(120));
        list.insert(1200,121);
        list.display();
    }
}
