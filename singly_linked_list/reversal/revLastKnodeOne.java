package reversal;

import java.util.List;

import traversal.lengthOfTheList;
import util.LL_Util;
import util.ListNode;

public class revLastKnodeOne {
    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        ListNode enumer = rev(head, 2);
        ListNode curr = enumer;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static int length(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static ListNode reversed(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode rev(ListNode head, int k) {

        int length = length(head);
        ListNode curr = head;
        int count = 1;
        if (k <= 0)
            return head;

        if (k >= length)
            return reversed(head);

        while (curr != null && count < (length - k)) {
            curr = curr.next;
            count++;
        }

        ListNode suffix = reversed(curr.next);

        curr.next = suffix;
        return head;
    }
}
