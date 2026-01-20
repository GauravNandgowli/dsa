package traversal;

import util.*;

public class lengthOfTheList {
    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        System.out.println(length(head));
    }

    public static int length(ListNode head) {
        if (head == null)
            return 0;
        if (head.next == null)
            return 1;

        int length = 1;
        ListNode curr = head;
        while (curr.next != null) {
            length++;
            curr = curr.next;
        }
        return length;

    }
}
