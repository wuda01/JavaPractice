package offercode.BinaryTrees;

import java.util.ArrayList;

public class offer_26 {

    /**
     * 二叉搜索树与双向链表
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
     */

    public static void main(String[] args) {

        TreeNode node = new TreeNode(10);
        TreeNode t1 = new TreeNode(6);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(12);
        TreeNode t7 = new TreeNode(14);

        node.left = t1;
        node.left.left = t2;
        node.left.right = t3;
        node.left.left.left = t4;

        node.right = t5;
        node.right.left = t6;
        node.right.right = t7;

        System.out.println(Convert(node).val);

    }

/*    private static TreeNode pre = null;
    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        Convert(pRootOfTree.left);  //遍历左节点
        if (pre != null) {
            pRootOfTree.left = pre; //
            pre.right = pRootOfTree;
        }
        pre = pRootOfTree; //根节点
        Convert(pRootOfTree.right);
        return pre;
    }*/

    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null)
            return null;
        ArrayList<TreeNode> list=new ArrayList<>();
        Convert(list,pRootOfTree);
        return Convert(list);
    }

    public static void Convert(ArrayList<TreeNode> list,TreeNode root){
        if (root!=null){
            Convert(list,root.left);
            list.add(root);
            Convert(list,root.right);
        }
    }

    public static TreeNode Convert(ArrayList<TreeNode> list){
        TreeNode head=list.get(0);
        TreeNode cur=head;
        for (int i=1;i<list.size();++i){
            TreeNode node=list.get(i);
            node.left = cur;
            cur.right = node;
            cur = node;
        }
        return head;
    }

}
