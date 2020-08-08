package offercode.BinaryTrees;


public class offer_58 {

    /**
     * 对称的二叉树
     * 请实现一个函数，用来判断一颗二叉树是不是对称的。
     * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
     */

    public static boolean isEquals(TreeNode root) {
        if (root==null) return true;
        return compareTo(root.left, root.right);
    }

    public static boolean compareTo(TreeNode left, TreeNode right) {
        if (left==null && right==null) return true;
        if (left==null || right==null) return false;

        if (left.val==right.val) {
            boolean ans = compareTo(left.left, right.right) && compareTo(left.right, right.left);
            return ans;
        }
        return false;
    }

    public static void main(String[] args) {

        TreeNode node = new TreeNode(0);
        TreeNode l1= new TreeNode(100);
        TreeNode l2 = new TreeNode(100);
        TreeNode l3 = new TreeNode(300);
        TreeNode l4 = new TreeNode(400);
        TreeNode l5 = new TreeNode(400);
        TreeNode l6 = new TreeNode(300);

        node.left = l1;
        node.right = l2;
        node.left.left = l3;
        node.left.right = l4;
        node.right.left = l5;
        node.right.right = l6;

        /*System.out.println(node.left.left.val);
        System.out.println(node.left.right.val);
        System.out.println(node.right.left.val);
        System.out.println(node.right.right.val);*/
        System.out.println(isEquals(node));

    }


}
