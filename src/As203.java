public class As203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode();
        ListNode current = dummyNode;
        if(head==null) return null;
        while (head.next != null) {
            if (head.val != val) {
                current.next = head;
                head = head.next;
                current = current.next;
            } else {
                head = head.next;
            }
        }
         if(head.val != val){
            current.next = head;
            current = current.next;
        }else{
            current.next = null;
            current = current.next;
        }
        return dummyNode.next;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        // testcase 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        // testcase 2
        // ListNode head = new ListNode(7);
        // head.next = new ListNode(7);
        // head.next.next = new ListNode(7);
        // head.next.next.next = new ListNode(7);

        // testcase 3
        // ListNode head = new ListNode(1);

        As203 obj = new As203();
        printList(obj.removeElements(head, 6));
    }
}
