public class As206 {
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

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(" " + node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = reverseList(head);
        printList(head);
    }
}
