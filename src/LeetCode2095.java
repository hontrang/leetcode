public class LeetCode2095 {
    public ListNode deleteMiddle(ListNode head) {
        ListNode current = head;
        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next == null) {
            return null;
        }
        while (fast != null && fast.next != null) {
            current = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        current.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(7);
//        head.next = new ListNode(9);
//        head.next.next = new ListNode(6);
//        head.next.next.next = new ListNode(6);
//        head.next.next.next.next = new ListNode(7);
//        head.next.next.next.next.next = new ListNode(8);
//        head.next.next.next.next.next.next = new ListNode(3);
//        head.next.next.next.next.next.next.next = new ListNode(0);
//        head.next.next.next.next.next.next.next.next = new ListNode(9);
//        head.next.next.next.next.next.next.next.next.next = new ListNode(5);

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//        As1721 obj = new As1721();
//        obj.swapNodes(head, 2).printList();

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        As1721 obj = new As1721();
//        obj.swapNodes(head, 1).printList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        LeetCode2095 obj = new LeetCode2095();
        obj.deleteMiddle(head).printList();
    }
}
