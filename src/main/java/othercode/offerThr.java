package othercode;

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


}
