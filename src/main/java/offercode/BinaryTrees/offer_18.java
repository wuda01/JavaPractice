package offercode.BinaryTrees;

public class offer_18 {

    /**
     * 二叉树的镜像
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     * 输入描述:
     * 二叉树的镜像定义：源二叉树
     *     	    8
     *     	   /  \
     *     	  6   10
     *     	 / \  / \
     *     	5  7 9 11
     *     	镜像二叉树
     *     	    8
     *     	   /  \
     *     	  10   6
     *     	 / \  / \
     *     	11 9 7  5
     */

    public static void main(String[] args) {

    }

    public TreeNode Mirror(TreeNode root) {
        if(root==null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);

        return root;
    }

}
