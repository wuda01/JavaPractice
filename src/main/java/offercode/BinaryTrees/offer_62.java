package offercode.BinaryTrees;

public class offer_62 {

    /**
     * 二叉搜索树的第k个节点
     * 给定一棵二叉搜索树，请找出其中的第k小的结点。
     * 例如，（5，3，7，2，4，6，8）中，按结点数值大小顺序第三小结点的值为4。
     */

    public static int index = 0;

    public static TreeNode kthNode(TreeNode root, int k) {
        if (root!=null) {
            TreeNode node = kthNode(root.left, k);
            if (node!=null) return node;
            index++;
            if (k==index) return root;
            node = kthNode(root.right, k);
            if (node!=null) return node;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        TreeNode l1= new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);
        TreeNode l4 = new TreeNode(4);
        TreeNode l5 = new TreeNode(5);
        TreeNode l6 = new TreeNode(6);
        TreeNode l7 = new TreeNode(7);

        node.left = l1;
        node.right = l2;
        node.left.left = l3;
        node.left.right = l4;
        node.left.left.left = l7;
        node.right.left = l5;
        node.right.left.right = l6;

        System.out.println(kthNode(node, 5).val);
    }
}
