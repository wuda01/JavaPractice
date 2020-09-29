package Main;

public class Main03 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        if(p1 == null || p2 == null) return null;
        int len1 = 0;
        while(p1.next != null) {
            p1 = p1.next;
            len1 ++;
        }
        int len2 = 0;
        while(p2.next != null) {
            p2 = p2.next;
            len2 ++;
        }
        if(p1 != p2) return null;
        int le = Math.abs(len1 - len2);     //长度差
        if(len1 > len2) {
            p1 = headA;
            p2 = headB;
        } else {
            p1 = headB;
            p2 = headA;
        }
        for(int i=0; i < le; i++){ p1 = p1.next; }
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
