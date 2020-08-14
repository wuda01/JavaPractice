package offercode.LinkedLists;


import java.util.Stack;

public class offer_15 {

    /**
     * 反转链表
     * 输入一个链表，反转链表后，输出新链表的表头。
     */

    public static void main(String[] args) {

        ListNode node = new ListNode(0);
        ListNode l1= new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(100);
        node.next = l1;
        node.next.next = l2;
        node.next.next.next = l3;
        node.next.next.next.next = l4;
        //node = l5;
        System.out.println(node.toString());
        System.out.println(ReverseList(node).toString());

    }

    public static ListNode ReverseList(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode pre = null;
        ListNode nex = null;

        /**
         * 0->1->2->3->3
         * 1.
         *   nex = 1->2->3->4
         *   head = 0->null
         *   pre = 0->null
         *   head = 1->2->3->4
         * 2.
         *   nex = 2->3->4
         *   head = 1->0->null
         *   pre = 1->0->null
         *   head = 2->3->4
         */

        while(head!=null){
            nex = head.next;
            head.next = pre;
            pre = head; //最后一个数
            head = nex;
        }
        return pre;
    }

}
