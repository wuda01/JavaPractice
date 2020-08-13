package othercode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class offerTen {

    //offer_01
    public static boolean Find(int target, int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if(rows==0 || cols==0) return false;
        int col = 0;
        int row = rows-1;
        while (row>=0 && col<cols) {
            if (array[row][col]<target) {
                col++;
            } else if (array[row][col]>target) {
                row--;
            } else {
                return true;
            }
        }
        return false;
    }

    //offer_02
    public String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //offer_03
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode node = listNode;
        while (node != null) {
            list.add(0, node.val);
            node = node.next;
        }
        return list;
    }

    //offer_04
    public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        if (pre.length==0 || in.length==0) return null;
        TreeNode root = new TreeNode(pre[0]);
        for (int i=0; i<in.length; i++) {
            if (in[i] == root.val) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1),
                        Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length),
                        Arrays.copyOfRange(in, i+1, in.length));
                break;
            }
        }
        return root;
    }

    //offer_05
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.size()<=0) {
            while (stack1.size()!=0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    //offer_06
    public int minNumberInRotateArray(int[] array) {
        if (array.length==0) return 0;
        int result = 0;
        for (int i=0; i<array.length-1; i++) {
            if (array[i]>array[i+1]) {
                result = array[i+1];
            }
        }
        return result;
    }

    //offer_07
    public int Fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    //offer_08
    //f[n] = f[n-1] + f[n-2]
    public int JumpFloor(int target) {
        if (target==0 || target==1) return target;
        int a=1, b=1, r=0;
        for (int i=2; i<=target; i++) {
            r = a+b;
            a = b;
            b = r;
        }
        return r;
    }

    //offer_09
    //f[n] = f[n-1] + f[n-2] + ... + f[0]
    public int JumpFloorII(int target) {
        if (target==0 || target==1) return target;
        int result = (int) Math.pow(2, target-1);
        return result;
    }

    //offer_10
    public int RectCover(int target) {
        if (target==0 || target==1 ||target==2) return target;
        int a=1, b=2, r=0;
        for (int i=3; i<=target; i++) {
            r = a+b;
            a = b;
            b = r;
        }
        return r;
    }



}
