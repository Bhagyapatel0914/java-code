package BinaryTree;

public class SubtreeQuestion {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }
    public static boolean subtree(TreeNode root ,TreeNode subroot){
        if(subroot == null){
            return true;
        }
        if (root==null){
            return false;
        }
        if (root.val == subroot.val){
            if (isidentical(root,subroot)){
                return true;
            }
        }
        return subtree(root.left,subroot.left) || subtree(root.right,root.right);
    }

    private static boolean isidentical(TreeNode root , TreeNode subroot) {
        if (root == null && subroot == null){
            return true;
        }
        if (root == null || subroot == null){
            return false;
        }
        return isidentical(root.left,subroot.left) && isidentical(root.right,subroot.right);
    }
}
