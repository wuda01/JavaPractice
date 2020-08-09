package offercode.BinaryTrees;

public class offer_39 {

    /**
     * 平衡二叉树
     * 题目描述
     * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
     * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
     *
     * 平衡二叉树是左子树的高度与右子树的高度差的绝对值小于等于1，
     * 同样左子树是平衡二叉树，右子树为平衡二叉树
     */

    public static int depth(TreeNode root) {
        if (root==null) return 0;
        int left = depth(root.left);
        if (left==-1) return -1;
        int right = depth(root.right);
        if (right==-1) return -1;
        if (left-right<(-1) || left-right>1) {
            return -1;
        } else {
            return 1+(left>right?left:right);
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return depth(root)!=-1;
    }

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(66);
        TreeNode t1 = new TreeNode(60);
        TreeNode t2 = new TreeNode(50);
        TreeNode t3 = new TreeNode(30);
        TreeNode t4 = new TreeNode(77);
        TreeNode t5 = new TreeNode(75);
        TreeNode t6 = new TreeNode(88);

        node1.left = t1;
        node1.right = t4;
        node1.left.left = t2;
        node1.right.left = t5;
        node1.right.right = t6;
        node1.left.left.left = t3;

        TreeNode node2 = new TreeNode(66);
        TreeNode t10 = new TreeNode(60);
        TreeNode t20 = new TreeNode(77);
        TreeNode t30 = new TreeNode(50);
        TreeNode t40 = new TreeNode(62);
        TreeNode t50 = new TreeNode(72);
        TreeNode t60 = new TreeNode(88);
        TreeNode t70 = new TreeNode(30);
        TreeNode t80 = new TreeNode(51);
        TreeNode t90 = new TreeNode(82);
        TreeNode t00 = new TreeNode(33);

        node2.left = t10;
        node2.right = t20;
        node2.left.left = t30;
        node2.left.right = t40;
        node2.right.left = t50;
        node2.right.right = t60;
        node2.left.left.left = t70;
        node2.left.left.right = t80;
        node2.right.right.left = t90;
        //node2.left.left.left.right = t00;


        //false
        System.out.println(isBalanced(node1));

        //true
        System.out.println(isBalanced(node2));



    }


}
