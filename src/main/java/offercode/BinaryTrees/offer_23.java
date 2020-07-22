package offercode.BinaryTrees;

import offercode.BinaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class offer_23 {

    /**
     * 从上往下打印二叉树
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     */

    public static void main(String[] args) {


    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();

        if(root==null) return res;

        deque.add(root);
        while(!deque.isEmpty()){
            TreeNode node = deque.getFirst();
            deque.pollFirst();
            res.add(node.val);

            if(node.left!=null) deque.addLast(node.left);
            if(node.right!=null) deque.addLast(node.right);
        }

        return res;
    }


}
