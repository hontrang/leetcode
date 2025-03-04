public class LeetCode206 {
    // https://youtube.com/shorts/Du4elALktj8?si=6OTsbyPTtq1_qzos
    public static ListNode reverseList(ListNode head) {
        // Initialize three pointers: curr, prev and next
        ListNode curr = head, prev = null, next;
        // Traverse all the nodes of Linked List
        while (curr != null) {

            // Store next
            next = curr.next;

            // Reverse current node's next pointer
            curr.next = prev;

            // Move pointers one position ahead
            prev = curr;
            curr = next;
        }

        // Return the head of reversed linked list
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = reverseList(head);
        head.printList();
    }
}
