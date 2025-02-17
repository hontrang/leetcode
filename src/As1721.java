import java.util.ArrayList;

public class As1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode dummyNode = new ListNode();
        ListNode current = dummyNode;
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }
        if (nodes.size() == 2) {
            dummyNode.next = nodes.get(1);
            dummyNode.next.next = nodes.get(0);
            dummyNode.next.next.next = null;
            return dummyNode.next;
        }
        if (k == 1 || k == nodes.size()) {
            nodes.get(0).next = null;
        }
        ListNode nodeA = nodes.get(k - 1);
        ListNode nodeB = nodes.get(nodes.size() - k);
        nodes.set(k - 1, nodeB);
        nodes.set(nodes.size() - k, nodeA);

        for (ListNode node : nodes) {
            current.next = node;
            current = current.next;
        }
        return dummyNode.next;
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

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        As1721 obj = new As1721();
        obj.swapNodes(head, 2).printList();
    }
}
