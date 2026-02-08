package slidingWindow;

import java.util.List;

import traversal.lengthOfTheList;
import util.LL_Util;
import util.ListNode;

public class maxSum {

    public static void main(String[] args) {
        int[] input = { 2, -5, -6, 1, 3, -4, -9, 10 };
        ListNode head = LL_Util.fromArray(input);

        System.out.println(sum(head, 3));

    }

    public static int sum(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        // if (head == null || head.next == null || k == 0)
        // return -1;
        for (int i = 0; i < k; i++) {
            if (end == null)
                return -1;
            sum = sum + end.val;
            end = end.next;
        }
        max = sum;
        while (end != null) {
            sum = sum - start.val;
            start = start.next;
            sum = sum + end.val;
            end = end.next;
            max = Math.max(sum, max);
        }
        return max;
    }

}