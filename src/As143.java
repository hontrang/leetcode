public class As143 {
    public ListNode reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondPart = slow.next;
        slow.next = null;
        ListNode current = secondPart;
        ListNode prev = null;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        secondPart = prev;
        ListNode firstPart = head;
        ListNode dummyNode = new ListNode();
        ListNode pointer = dummyNode;
        while (secondPart != null) {
            ListNode nextFirst = firstPart.next;
            ListNode nextSecond = secondPart.next;
            firstPart.next = secondPart;
            pointer.next = firstPart;
            firstPart = nextFirst;
            secondPart = nextSecond;
            pointer = pointer.next.next;
        }
        if(firstPart!=null) {
            pointer.next = firstPart;
        }else {
            pointer.next = secondPart;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        // 1 2 3 4
        // 1 2 3 4 5
        As143 obj = new As143();
        obj.reorderList(head).printList();
    }
}
