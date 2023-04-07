package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CL list = new CL();
        list.insert(12);
        list.insert(1200);
        list.insert(1285);
        list.insert(12234);
        list.insert(12212);
        list.display();
        list.delet(1285);
        list.display();
    }
}
