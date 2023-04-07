package SinglyLinkedList;

import SinglyLinkedList.LL;

public class Main  {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(1200);
        list.insertfirst(2);
        list.insertfirst(1);
        list.insertfirst(120);
        list.display();
        list.insertlast(100);
        list.display();
        list.insert(0,12);
        list.display();
        list.delefirst();
        list.display();
        list.delete(2);
        list.display();

    }
}