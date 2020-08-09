package offercode.BinaryTrees;

import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

import java.util.*;

public class offer_60 {

    /**
     * 把二叉树打印成多行
     * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     */

    public static  void printTree(TreeNode root) {

        //打印成一行
        /*if (root==null) System.out.println(-1);
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left!=null) queue.offer(node.left);
            if (node.right!=null) queue.offer(node.right);
        }*/

        //打印成多行
        if (root==null) System.out.println(-1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            for (int j=0; j<list.size(); j++) {
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        /*TreeNode node = new TreeNode(0);
        TreeNode l1= new TreeNode(100);
        TreeNode l2 = new TreeNode(200);
        TreeNode l3 = new TreeNode(300);
        TreeNode l4 = new TreeNode(400);
        TreeNode l5 = new TreeNode(500);
        TreeNode l6 = new TreeNode(600);
        TreeNode l7 = new TreeNode(700);
        TreeNode l8 = new TreeNode(800);
        TreeNode l9 = new TreeNode(900);
        TreeNode l10 = new TreeNode(1000);
        TreeNode l11 = new TreeNode(1100);
        TreeNode l12 = new TreeNode(1200);
        TreeNode l13 = new TreeNode(1300);
        TreeNode l14 = new TreeNode(1400);

        node.left = l1;
        node.right = l2;
        node.left.left = l3;
        node.left.right = l4;
        node.right.left = l5;
        node.right.right = l6;
        node.left.left.left = l7;
        node.left.left.right = l8;
        node.left.right.left = l9;
        node.left.right.right = l10;
        node.right.left.left = l11;
        node.right.left.right = l12;
        node.right.right.left = l13;
        node.right.right.right = l14;

        printTree(node);*/

        TreeNode node2 = new TreeNode(66);
        TreeNode t1 = new TreeNode(60);
        TreeNode t2 = new TreeNode(77);
        TreeNode t3 = new TreeNode(50);
        TreeNode t4 = new TreeNode(62);
        TreeNode t5 = new TreeNode(72);
        TreeNode t6 = new TreeNode(88);
        TreeNode t7 = new TreeNode(30);
        TreeNode t8 = new TreeNode(51);
        TreeNode t9 = new TreeNode(82);
        TreeNode t0 = new TreeNode(33);

        node2.left = t1;
        node2.right = t2;
        node2.left.left = t3;
        node2.left.right = t4;
        node2.right.left = t5;
        node2.right.right = t6;
        node2.left.left.left = t7;
        node2.left.left.right = t8;
        node2.right.right.left = t9;
        node2.left.left.left.right = t0;

        printTree(node2);

    }
}
