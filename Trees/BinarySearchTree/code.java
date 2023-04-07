package BinarySearchTree;

import java.util.ArrayList;

public  class code {
    static class  Node{
        Node left ;
        Node right ;
        int val;
        public Node(int val) {
            this.val = val;
        }
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static Node printtree(Node root , int value){
      if (root == null){
          root = new Node(value);
          return  root ;
      }
        if (root.val > value){
            // insert  in left
            root.left = printtree(root.left,value);
        }else {
            // Search in hte right side
            root.right = printtree(root.right,value);
        }
        return  root;
    }
    public static boolean findkey(Node root , int value ) {
        if (root.val == value){
            return  true;
        }
        if(root.val > value){
            return findkey(root.left,value);
        }
        else{
            return findkey(root.right,value);
        }
    }
    public static Node delete(Node root , int value){
        if (root.val > value){
            root.left = delete(root.left,value);
        }else if (root.val < value){
            root.right = delete(root.right,value);
        } else {
            // case 1 if root.val = value
            if (root.right == null && root.left == null){
                return null;
            }
            // case 2
            if (root.right == null){
                return root.left;
            }else if(root.left == null){
                return root.right;
            }
        // case 3
        Node inordersuccesor = inordersucc(root.right);
        root.val = inordersuccesor.val;
       root.right =   delete(root.right,inordersuccesor.val);
        }
        return root;
    }
    private static Node inordersucc(Node root) {
        while (root.left!= null){
            root = root.left;
        }
        return root; // left most part of the right
    }
    public static void printinrange(Node root ,int X , int Y){
        if (root == null){
            return;
        }
        if(root.val  >= X && root.val<= Y ){
             printinrange(root.left,X,Y);
            System.out.print(root.val+ " ");
            printinrange(root.right,X,Y);
        }
        else if (root.val < X){  // Here the smallest limit is greater than the root therefore search in the right
          printinrange(root.right,X,Y);
        }else{ // Here the Y < root.val Largest is smaller than the root therefore search in the left
            printinrange(root.left,X,Y);
        }
    }
    public static void printroottoleaf(Node root , ArrayList<Integer> list){
       if (root == null){
           return;
       }
        list.add(root.val);
        if (root.right == null && root.left == null){
           printpath(list);
       }else {
            printroottoleaf(root.left,list);
            printroottoleaf(root.right,list);
        }
         list.remove(list.size()-1);
    }

    private static void printpath(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }
}
