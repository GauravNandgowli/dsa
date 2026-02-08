package reversal;

import util.LL_Util;
import util.ListNode;

public class revLastKnode {
    // overengineered sliding window
    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        ListNode enumer = rev(head, 4);
        ListNode curr = enumer;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static ListNode rev(ListNode head, int k) {

        if (head == null || k == 0 || head.next == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;
        ListNode last = head;
        ListNode start = head;
        ListNode end = head;

        int count = 0;
        while (curr != null) {

            while (end != null) {

                if (count > k - 1) {
                    last = start;
                    start = start.next;
                    count--;
                }

                if (count == k - 1) {

                    curr = start;
                }
                end = end.next;
                count++;

            }

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if (start == head) {
            return prev; // k == length → new head
        }
        last.next = prev;
        return head;
    }
}
