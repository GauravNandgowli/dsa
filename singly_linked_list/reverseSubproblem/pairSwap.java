package reverseSubproblem;

import util.LL_Util;
import util.ListNode;

public class pairSwap {
    public static void main(String[] args) {

        int[] inputOne = { 1, 2, 3, 4, 5, 6 };
        ListNode headOne = LL_Util.fromArray(inputOne);

        ListNode enumer = swap(headOne);
        ListNode curr = enumer;
        System.out.println();
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static ListNode swap(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode next = head.next;
        ListNode nextRefernce = next.next;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevRefernce = dummy;
        while (curr != null && curr.next != null) {
            next.next = curr;
            curr.next = nextRefernce;
            prevRefernce.next = next;
            prevRefernce = curr;
            curr = curr.next;
            if (curr != null && curr.next != null) {
                next = curr.next;
                nextRefernce = next.next;
            }

        }
        return dummy.next;
    }
}
