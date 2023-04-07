package BinaryTree;

import BinaryTree.Binarytree;

public class Main extends Binarytree {
    public static void main(String[] args) {
        int [] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.root(arr);
      //  System.out.println(root.val);
//        preorderseq(root);
//        inorder(root);
    //    postorder(root);
//        trans(root);
//        System.out.println(counts(root));;
//        System.out.println(sum(root));
//        System.out.println(height(root));
     //   System.out.println(diameter(root));
        System.out.println(dia(root).diameter);
    }
}