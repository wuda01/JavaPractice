package offercode.LinkedLists;


import offercode.LinkedLists.offer_05;

public class offer_16 {

    /**
     * 反转链表
     * 输入一个链表，反转链表后，输出新链表的表头。
     */

    public static void main(String[] args) {

        offer_05.ListNode node = new offer_05.ListNode(0);
        offer_05.ListNode l1= new offer_05.ListNode(1);
        offer_05.ListNode l2 = new offer_05.ListNode(2);
        offer_05.ListNode l3 = new offer_05.ListNode(3);
        offer_05.ListNode l4 = new offer_05.ListNode(4);
        node.next = l1;
        node.next.next = l2;
        node.next.next.next = l3;
        node.next.next.next.next = l4;
        System.out.println(ReverseList(node).val);

    }

    public static offer_05.ListNode ReverseList(offer_05.ListNode head) {

        if(head==null || head.next==null) return head;

        offer_05.ListNode pre = null;
        offer_05.ListNode nex = null;

        while(head!=null){
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }
}
