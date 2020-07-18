package offercode;

import java.util.ArrayList;

public class offer_05 {

    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);*/

        ListNode node = new ListNode(0);
        ListNode l1= new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        node.next = l1;
        node.next.next = l2;
        node.next.next.next = l3;
        System.out.println(printListFromTailToHead(node));

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode node = listNode;
        while (node != null){
            list.add(0,node.val);
            node = node.next;
        }
        return list;
    }


}
