package othercode;

import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

import java.util.*;

public class offerThr {

    //offer_21
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length==0 || popA.length==0) return false;
        Stack<Integer> tmp = new Stack<>();
        int index = 0;
        for (int i=0; i<pushA.length; i++) {
            tmp.push(pushA[i]);
            while (tmp.size()!=0 && tmp.peek()==popA[index]) {
                tmp.pop();
                index++;
            }
        }
        return tmp.isEmpty();
    }

    //offer_22
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        if (root==null) return result;
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.getFirst();
            deque.pollFirst();
            result.add(node.val);
            if (node.left!=null) deque.addLast(node.left);
            if (node.right!=null) deque.addLast(node.right);
        }
        return result;
    }

    //offer_23
    public boolean VerifySquenceOfBST(int[] sequence) {
        int len = sequence.length;
        if (sequence==null || len==0) return false;
        int root = sequence[len-1];
        int i = len-1;
        for (; i>=0; i--) {
            if (sequence[i]<root) break;
        }
        int j = i;
        for (; j>=0; j--) {
            if (sequence[j]>root) return false;
        }
        boolean left=true, right=true;
        if (i>=0) left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i+1));
        if (i<len-1) right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i+1, len-1));
        return left && right;
    }

    //offer_24
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root==null) return result;
        ArrayList<Integer> path = new ArrayList<>();
        this.Find(root, target, path, result);
        return result;
    }
    public void Find(TreeNode root, int target, ArrayList<Integer> path,
                     ArrayList<ArrayList<Integer>> result) {
        if (root==null) return;
        path.add(root.val);
        target-=root.val;
        if (target==0 && root.left==null && root.right==null) {
            result.add(path);
            return;
        }
        this.Find(root.left, target, new ArrayList<>(path), result);
        this.Find(root.right, target, new ArrayList<>(path), result);
    }

    //offer_25
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead==null) return null;
        RandomListNode result = new RandomListNode(pHead.label);
        RandomListNode cur = pHead;
        RandomListNode p = result;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        while (pHead!=null) {
            map.put(pHead, new RandomListNode(pHead.label));
            pHead = pHead.next;
        }
        while (cur!=null) {
            p.next = map.get(cur.next);
            p.random = map.get(cur.random);
            p = p.next;
            cur = cur.next;
        }
        return result;
    }

    //offer_26
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null) return null;
        ArrayList<TreeNode> list = new ArrayList<>();
        Convert(list, pRootOfTree);
        return Convert(list);
    }
    public void Convert(ArrayList list, TreeNode root) {
        if (root!=null) {
            Convert(list, root.left);
            list.add(root);
            Convert(list, root.right);
        }
    }
    public TreeNode Convert(ArrayList<TreeNode> list) {
        TreeNode result = list.get(0);
        TreeNode cur = result;
        for (int i=1; i<list.size(); i++) {
            TreeNode node = list.get(i);
            node.left = cur;
            cur.right = node;
            cur = node;
        }
        return result;
    }

    //offer_27
    ArrayList<String> result = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if (str==null || str.length()==0) return result;
        String[] strs = str.split("");
        ArrayList<String> arr = new ArrayList<>();
        for (String s : strs) arr.add(s);
        StringBuilder sb = new StringBuilder();
        add(arr, sb);
        return result;
    }
    public void add(ArrayList<String> arr, StringBuilder sb) {
        if (arr.size()==1) {
            sb.append(arr.get(0));
            int index = sb.indexOf(sb.toString());
            if (index==-1) result.add(sb.toString());
        }
        for (int i=0; i<arr.size(); i++) {
            StringBuilder newSb = new StringBuilder();
            newSb.append(sb.toString());
            newSb.append(arr.get(i));
            ArrayList<String> temp = new ArrayList<>(arr);
            temp.remove(i);
            add(temp, newSb);
        }
    }

    //offer_28
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array.length<1) return 0;
        int len = array.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i])+1);
            } else {
                map.put(array[i], 1);
            }
            if (map.get(array[i])>len) {
                return array[i];
            }
        }
        return 0;
    }

    //offer_29
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input.length<k || k==0) return result;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<input.length; i++) {
            pq.add(input[i]);
        }
        for (int i=0; i<k; i++) {
            result.add(pq.poll());
        }
        return result;
    }

    //offer_30
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0) return 0;
        int max = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i-1] > 0) {
                array[i]+=array[i-1];
            }
            max = Math.max(array[i], max);
        }
        return max;
    }


}
