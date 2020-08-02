package offercode.BinaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class offer_61 {

    /**
     * 把二叉树打印成多行
     * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     */

    public static  void printTree(TreeNode root) {
        if (root==null) System.out.println(-1);;
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        int flag = 1;
        s2.push(root);
        ArrayList<Integer> tem = new ArrayList<Integer>();
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (flag%2 != 0) {
                while (!s2.isEmpty()) {
                    TreeNode node = s2.pop();
                    tem.add(node.val);
                    if (node.left != null) {
                        s1.push(node.left);
                    }
                    if (node.right != null) {
                        s1.push(node.right);
                    }
                }
            }
            if (flag%2 == 0) {
                while (!s1.isEmpty()) {
                    TreeNode node = s1.pop();
                    tem.add(node.val);
                    if (node.left != null) {
                        s2.push(node.left);
                    }
                    if (node.right != null) {
                        s2.push(node.right);
                    }
                }
            }
            for (int i = 0; i < tem.size(); i++) {
                System.out.print(tem.get(i)+" ");
            }
            tem.clear();
            flag++;
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        TreeNode l1= new TreeNode(100);
        TreeNode l2 = new TreeNode(200);
        TreeNode l3 = new TreeNode(300);
        TreeNode l4 = new TreeNode(400);
        TreeNode l5 = new TreeNode(500);
        TreeNode l6 = new TreeNode(600);

        node.left = l1;
        node.right = l2;
        node.left.left = l3;
        node.left.right = l4;
        node.right.left = l5;
        node.right.right = l6;

        printTree(node);
    }
}
