package offercode.LinkedLists;

public class offer_16 {

    /**
     * 合并两个排序的链表
     * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
     */

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode l1= new ListNode(3);
        ListNode l2 = new ListNode(5);

        ListNode n2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(6);
        n1.next = l1;
        n1.next.next = l2;
        n2.next = l3;
        n2.next.next = l4;

        //n1 1->3->5
        //n2 2->4->6
        //System.out.println(n1.toString());
        //System.out.println(n2.toString());
        System.out.println(Merge(n1,n2).toString());

        ListNode t = new ListNode(0);
        ListNode x = t;
        x.add(1);
        x.add(2);
        x.add(3);
        System.out.println(t.toString());


    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0); //创建一个新链表，head为头节点
        ListNode merge = head;
        //System.out.println(head.toString());

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

        //System.out.println(head.toString());
        return head.next;
    }
}
