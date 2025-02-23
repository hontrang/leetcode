import java.util.ArrayList;

public class As143 {
    public ListNode reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ArrayList<ListNode> tempList = new ArrayList<>();
        ListNode dummyNode = new ListNode();
        ListNode current = dummyNode;
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        int mid = list.size() % 2 == 0 ? list.size() / 2 - 1 : list.size() / 2;
        for (int i = 0; i < list.size(); i++) {
            ListNode item1 = list.get(i);
            ListNode item2 = list.get(list.size() - i - 1);
            if (i <= mid) {
                tempList.add(item1);
                tempList.add(item2);
            }
        }
        for (ListNode n : tempList) {
            current.next = n;
            current = current.next;
        }
        current.next = null;
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
