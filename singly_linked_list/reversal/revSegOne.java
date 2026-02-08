package reversal;

import util.LL_Util;
import util.ListNode;

public class revSegOne {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ListNode head = LL_Util.fromArray(input);

        ListNode enumer = rev(head, 1, 3);
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

    public static ListNode reversed(ListNode head, ListNode limit) {
        ListNode curr = head;
        ListNode prev = limit;

        while (curr != limit) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode rev(ListNode head, int left, int right) {
        ListNode prefixLastNode = null;
        ListNode curr = head;
        ListNode rightBound = null;
        int count = 1;

        while (curr != null && count < left - 1) {
            count++;
            curr = curr.next;
        }
        prefixLastNode = curr;
        while (curr != null && count < right + 1) {
            count++;
            curr = curr.next;
        }
        rightBound = curr;
        ListNode reversedSegement = reversed(prefixLastNode.next, curr);
        prefixLastNode.next = reversedSegement;
        return head;
    }
}
