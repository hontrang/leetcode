public class As1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummyNode = head;
        ListNode prevX = null;
        ListNode prevY = null;
        ListNode nodeX = null;
        ListNode nodeY = null;
        int size = 0;
        while (dummyNode != null) {
            dummyNode = dummyNode.next;
            size++;
        }
        int nodeXPos = k - 1;
        int nodeYPos = size - k;
        dummyNode = head;
        for (int i = 0; i < size; i++) {
            if (i == nodeXPos - 1) prevX = dummyNode;
            if (i == nodeXPos) nodeX = dummyNode;
            if (i == nodeYPos - 1) prevY = dummyNode;
            if (i == nodeYPos) nodeY = dummyNode;
            dummyNode = dummyNode.next;
        }
        if (nodeX == null || nodeY == null || nodeX == nodeY) return head;
        if (prevX != null) prevX.next = nodeY;
        else head = nodeY;

        if (prevY != null) prevY.next = nodeX;
        else head = nodeX;

        ListNode temp = nodeX.next;
        nodeX.next = nodeY.next;
        nodeY.next = temp;

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
        As1721 obj = new As1721();
        obj.swapNodes(head, 1).printList();
    }
}
