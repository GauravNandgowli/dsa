package slidingWindow;

import util.LL_Util;
import util.ListNode;

public class KRotations {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5 };
        ListNode head = LL_Util.fromArray(input);

        ListNode enumer = rotate(head, 2);
        ListNode curr = enumer;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static ListNode rotate(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        k = k % length(head);
        if (k == 0)
            return head;
        ListNode res = reverse(head, null);
        ListNode temp = null;
        ListNode start = res;
        ListNode end = res;
        for (int i = 0; i < k; i++) {
            if (end == null)
                return head;
            end = end.next;
        }
        temp = reverse(start, end);
        res = reverse(end, null);
        ListNode curr;
        curr = temp;
        while (curr.next != null)
            curr = curr.next;
        curr.next = res;
        return temp;

    }

    public static ListNode reverse(ListNode start, ListNode rightBound) {
        ListNode curr = start;
        ListNode prev = null;
        while (curr != rightBound) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
