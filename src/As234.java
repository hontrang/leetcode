import java.util.ArrayList;
import java.util.List;

public class As234 {

    public boolean isPalindrome(ListNode head) {
        List listValue = new ArrayList<Character>();
        while (head != null) {
            listValue.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < listValue.size(); i++) {
            for (int j = listValue.size() - i - 1; j > 0; j--) {
                if (listValue.get(i) != listValue.get(j))
                    return false;
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        As234 obj = new As234();
        System.out.println(obj.isPalindrome(head));
    }
}
