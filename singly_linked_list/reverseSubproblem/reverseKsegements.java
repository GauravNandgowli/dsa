package reverseSubproblem;

import util.LL_Util;
import util.ListNode;

public class reverseKsegements {
    public static void main(String[] args) {

        int[] inputOne = { 1, 2, 3, 4, 5, 6 };
        ListNode headOne = LL_Util.fromArray(inputOne);

        ListNode enumer = revK(headOne);
        ListNode curr = enumer;
        System.out.println();
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static ListNode revK(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode start = head;
        ListNode end = head.next;

        ListNode nextRefernce = null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevRefernce = dummy;

        while (curr != null && curr.next != null) {

        }
        return dummy.next;
    }
}
