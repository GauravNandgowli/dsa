import util.LL_Util;
import util.ListNode;

public class deleteLastNode {

    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        System.out.println(deleteLastNode_(head));
    }

    public static ListNode deleteLastNode_(ListNode head) {
        if (head == null || head.next == null) {
            head = null;
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        return head;
    }
}
