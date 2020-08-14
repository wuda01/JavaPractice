package offercode.LinkedLists;

public class ListNode {

    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val + "->" + next ;
    }

    //添加新的节点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if(this.next == null)
            this.next = newNode;
        else
            this.next.add(newval);
    }

    /* public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }*/
}
