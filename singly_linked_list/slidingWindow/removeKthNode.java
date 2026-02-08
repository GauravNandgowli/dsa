package slidingWindow;

import util.LL_Util;
import util.ListNode;

public class removeKthNode {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5 };
        ListNode head = LL_Util.fromArray(input);

        ListNode enumer = rem(head, 2);
        ListNode curr = enumer;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static ListNode rem(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;
        ListNode prev = null;
        for (int i = 0; i < k; i++) {
            if (end == null)
                return head;
            end = end.next;
        }
        while (end != null) {
            prev = start;
            start = start.next;
            end = end.next;
        }

        prev.next = start.next;

        return head;
    }
}
