class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}



public class ReverseSecondHalf {

 /*   public static void main(String[] args){
        ListNode a = new ListNode(0);
        a.add(1);

        ListNode a = ReverseSecondHalf.reverseSecondHalfList()
    }*/
    public static ListNode reverseSecondHalfList(ListNode head) {
        //  if (head == null || head.next == null || head.next.next == null)	return head;
        if (head == null || head.next == null)      return head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode pre = slow.next;
        ListNode cur = pre.next;
        while (cur != null) {
            pre.next = cur.next;
            cur.next = slow.next;
            slow.next = cur;
            cur = pre.next;
        }
        return head;
    }
}
