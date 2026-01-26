import util.LL_Util;
import util.ListNode;

public class deleteNodes {

    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        System.out.println(deleteNodesWithGivenData(head, 6));

    }

    public static ListNode deleteNodesWithGivenData(ListNode head, int data) {
        while (head != null && head.val == data)
            head = head.next;
        if (head == null)
            return null;

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            if (curr.val == data) {
                prev.next = curr.next;
                curr = prev;
            }
            prev = curr;
            curr = prev.next;
        }

        return head;
    }
}
