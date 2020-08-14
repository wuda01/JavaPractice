package othercode;

import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class offerTwe {

    //offer_11
    public int NumberOf1(int n) {
        int count = 0;
        while (n!=0) {
            count++;
            n = n&(n-1);
        }
        return count;
    }

    //offer_12
    public double Power(double base, int exponent) {
        double result = Math.pow(base, exponent);
        return result;
    }

    //offer_13
    public int[] reOrderArray(int[] array) {
        if (array.length<=1) return array;
        int i=0, j;
        while (i < array.length) {
            if (array[i]%2 != 0) { //奇数
                i++;
            } else { //偶数
                j = i+1;
                while (array[j]%2 == 0) {
                    if (j==array.length-1)
                        return array;
                    j++;
                }
                int temp = array[j];
                while (j > i) {
                    array[j] = array[j-1];
                    j--;
                }
                array[i] = temp;
            }
        }
        return array;
    }

    //offer_14
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null || k==0) return null;
        Stack<ListNode> sta = new Stack<>();
        while (head != null) {
            sta.push(head);
            head = head.next;
        }
        if (sta.size()<k)
            return null;
        while (k>1) {
            sta.pop();
            k--;
        }
        return sta.pop();
    }

    //offer_15
    public ListNode ReverseList(ListNode head) {
        if (head==null) return null;
        ListNode pre = null;
        ListNode nex = null;
        while (head!=null) {
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }

    //offer_16
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null && list2==null) return null;
        ListNode head = new ListNode(0); //创建一个新链表
        ListNode merge = head; //merge为head的一个节点
        while (list1!=null && list2!=null) {
            if (list1.val > list2.val) {
                merge.next = list2;
                list2 = list2.next;
            } else {
                merge.next = list1;
                list1 = list1.next;
            }
            merge = merge.next;
        }
        if (list1==null) merge.next = list2;
        if (list2==null) merge.next = list1;
        return head.next;
    }

    //offer_17
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1==null || root2==null) return false;
        if (root1.val==root2.val) {  //找到第一个相等的节点
            if (judge(root1, root2))
                return true;
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }
    public boolean judge(TreeNode root, TreeNode subroot) {  //判断树结构是否相等
        if (subroot==null) return true;
        if (root==null) return false;
        if (root.val==subroot.val) {
            return judge(root.left, subroot.left) && judge(root.right, subroot.right);
        }
        return false;
    }

    //offer_18
    public TreeNode Mirror(TreeNode root) {
        if (root==null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
        return root;
    }

    //offer_19
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix.length==0) return null;
        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length-1;
        int cols = matrix[0].length-1;
        int row=0, col=0;
        while (true) {
            //向右
            for (int i=col; i<=cols; i++) {
                result.add(matrix[row][i]);
            }
            row++;
            if (row>rows) break;
            //向下
            for (int i=row; i<=rows; i++) {
                result.add(matrix[i][cols]);
            }
            cols--;
            if (col>cols) break;
            //向左
            for (int i=cols; i>=col; i--) {
                result.add(matrix[rows][i]);
            }
            rows--;
            if (row>rows) break;
            //向上
            for (int i=rows; i>=row; i--) {
                result.add(matrix[i][col]);
            }
            col++;
            if (col>cols) break;
        }
        return result;
    }

    //offer_20
    Stack<Integer> stackTotal = new Stack<>();
    Stack<Integer> stackLitte = new Stack<>();
    public void push(int node) {
        stackTotal.push(node);
        if (stackLitte.isEmpty() || node<=stackLitte.peek()) {
            stackLitte.push(node);
        } else {
            stackLitte.push(stackLitte.peek());
        }
    }
    public void pop() {
        stackTotal.pop();
        stackLitte.pop();
    }
    public int top() {
        return stackTotal.peek();
    }
    public int min() {
        return stackLitte.peek();
    }


}
