package BinarySearchTree;

import java.util.ArrayList;

public class Main extends code{
    public static void main(String[] args) {
        int [] arr = {5,1,4,2,7};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
         root =  printtree(root , arr[i]);
        }
            inorder(root);
        System.out.println();
        System.out.println(findkey(root,4));
        delete(root , 4);
        inorder(root);
        //printinrange(root,1,7);
        printroottoleaf(root,new ArrayList<>());
    }
}
