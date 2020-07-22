package offercode.LinkedLists;

import offercode.LinkedLists.offer_05;

public class offer_17 {

    /**
     * 合并两个排序的链表
     * 输入一个链表，反转链表后，输出新链表的表头。
     */

    public static void main(String[] args) {
        offer_05.ListNode n1 = new offer_05.ListNode(1);
        offer_05.ListNode l1= new offer_05.ListNode(3);
        offer_05.ListNode l2 = new offer_05.ListNode(5);

        offer_05.ListNode n2 = new offer_05.ListNode(2);
        offer_05.ListNode l3 = new offer_05.ListNode(4);
        offer_05.ListNode l4 = new offer_05.ListNode(6);
        n1.next = l1;
        //n1.next.next = l2;
        n2.next = l3;
        n2.next.next = l4;

        System.out.println(Merge(n1,n2).toString());

    }

    public static offer_05.ListNode Merge(offer_05.ListNode list1, offer_05.ListNode list2) {
        offer_05.ListNode head = new offer_05.ListNode(0);
        offer_05.ListNode merge = head;

        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                merge.next = list2;
                list2 = list2.next;
            }else{
                merge.next = list1;
                list1 = list1.next;
            }
            merge = merge.next;
        }

        if(list1!=null) merge.next = list1;
        if(list2!=null) merge.next = list2;

        return head.next;
    }
}
