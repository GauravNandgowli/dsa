package reversal;

import util.LL_Util;
import util.ListNode;

public class revSegemnt {
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

    public static ListNode rev(ListNode head, int left, int right) {

        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;
        ListNode last = null;
        ListNode prefix = head;
        ListNode suffix = null;
        int count = 1;
        while (curr != null && count <= left) {
            prefix = curr;
            curr = curr.next;
            count++;
        }
        while (curr != null && count <= right) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            suffix = curr;
            count++;
        }
        ListNode temp = prev;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = suffix;
        prefix.next = prev;
        return head;
    }
}
