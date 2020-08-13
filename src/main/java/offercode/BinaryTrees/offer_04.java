package offercode.BinaryTrees;

import java.util.Arrays;

public class offer_04 {

    /**
     * 重建二叉树
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
     * 则重建二叉树并返回。
     */

    /**
     * 前序遍历：根节点->左子树->右子树（根->左->右）
     * 中序遍历：左子树->根节点->右子树（左->根->右）
     * 后序遍历：左子树->右子树->根节点（左->右->根）
     *
     * 根据前序序列第一个结点确定根结点,根据根结点在中序序列中的位置分割出左右两个子序列
     * 对左子树和右子树分别递归使用同样的方法继续分解
     * @param args
     */

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(7);
        TreeNode t7 = new TreeNode(8);

        node.left = t1;
        node.left.left = t3;
        node.left.left.right = t6;

        node.right = t2;
        node.right.left = t4;
        node.right.right = t5;
        node.right.right.left = t7;
        System.out.println(node.toString());

        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};

        System.out.println(reConstructBinaryTree(pre, in).toString());

    }

    public static TreeNode reConstructBinaryTree(int[] pre,int[] in) {

        if(pre.length==0 || in.length==0) return null;

        TreeNode root = new TreeNode(pre[0]);
        for(int i=0; i<in.length; i++){
            if(in[i]==pre[0]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),
                        Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),
                        Arrays.copyOfRange(in,i+1,in.length));
                break;
            }
        }
        return root;
    }

}
