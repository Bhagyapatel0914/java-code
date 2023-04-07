package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {
    public static class Node {
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static int index = -1;

    public static Node root(int[] arr) {
        index++;
        if (arr[index] == -1) {
            return null;
        }
        Node node = new Node(arr[index]);
        node.left = root(arr);
        node.right = root(arr);

        return node;
    }

    // pre order
    public static void preorderseq(Node root) {
        if (root == null) {
            System.out.print("-1" + " ");
            return;
        }
        System.out.print(root.val + " ");
        preorderseq(root.left);
        preorderseq(root.right);
    }

    // inorder
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    // Post order
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }

    // Level transversal
    public static void trans(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> list = new LinkedList<>();
        list.add(root);
        list.add(null);
        while (!list.isEmpty()) {
            Node node = list.remove();
            if (node == null) {
                System.out.println();
                if (list.isEmpty()) {
                    break;
                } else {
                    list.add(null);
                }
            } else {
                System.out.print(node.val + " ");
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
            }
        }
    }

       static int count = 0;
    public static int counts(Node root) {
        if (root == null) {
            return 0;
        }
//        int left = count(root.left);
//        int right = count(root.right);
//        return left + right + 1;
        if(root.left != null){
            count++;
            return count + counts(root.left);
        }
        count++;
        return count + counts(root.right);
    }
    public static int sum(Node root){
        if (root==null){
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        return root.val + left + right ;
    }
    public static int height(Node root){
        if (root == null){
            return 0;
        }
       int lefttree = 1 + height(root.left);
        int righttree = 1 + height(root.right);
        if (lefttree>righttree){
            return lefttree;
        }
        return righttree;
    }
    // O(n2) Complexity
    public static int diameter(Node root){
        if(root ==null){
            return 0;
        }
        int diam1 =  diameter(root.left);
        int diam2 =  diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3 ,Math.max(diam2,diam1));
    }
    // O(n) complexity
    static class Treeinfo{
        int height ;
        int diameter;

        public Treeinfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
    public static Treeinfo dia(Node root){
        if(root == null){
            return new Treeinfo(0,0);
        }
        Treeinfo left  = dia(root.left);
        Treeinfo right = dia(root.right);

        int height = Math.max(left.height,right.height) + 1;
        int  dia1 = left.diameter ;
        int dia2 = right.diameter;
        int  dia3 = left.height + right.height + 1;

        int mydia = Math.max(dia3,Math.max(dia1,dia2));
        return new Treeinfo(height , mydia);
    }
}

