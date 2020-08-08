package offercode.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class offer_61 {

    /**
     * 序列化二叉树
     * 请实现两个函数，分别用来序列化和反序列化二叉树
     */

    public static String serialize(TreeNode root){
        if (root==null) return "#,";
        StringBuffer sb = new StringBuffer(root.val+",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }

    public static TreeNode dserialize(String s){
        String[] arr = s.split(",");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        return pre(queue);
    }

    public static TreeNode pre(Queue<String> queue) {
        String s = queue.poll();
        if (s.equals("#")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(s));
        node.left = pre(queue);
        node.right = pre(queue);
        return node;
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

        String tree = serialize(node);
        System.out.println(tree);

        System.out.println(dserialize(tree));

    }
}
