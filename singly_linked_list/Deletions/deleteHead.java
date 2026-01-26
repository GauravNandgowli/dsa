
import util.LL_Util;
import util.ListNode;

public class deleteHead {

    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        System.out.println(deleteFirstNode(head));
    }

    public static ListNode deleteFirstNode(ListNode head) {
        if (head == null || head.next == null)
            return null;

        head = head.next;
        return head;
    }
}