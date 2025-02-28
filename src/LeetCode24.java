public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = head.next;
        ListNode prev = null;
        ListNode current = head;
        ListNode nodeX;
        ListNode nodeY;
        while ((current != null && current.next != null)) {
            nodeX = current;
            nodeY = current.next;

            nodeX.next = nodeY.next;
            nodeY.next = nodeX;

            if (prev != null) {
                prev.next = nodeY;
            }

            prev = nodeX;
            current = nodeX.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        LeetCode24 obj = new LeetCode24();
        obj.swapPairs(head).printList();
    }
}
