package splitList;

import util.LL_Util;
import util.ListNode;

public class splitEqual {

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ListNode head = LL_Util.fromArray(input);

        ListNode enumer = splitK(head, 3);
        ListNode curr = enumer;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static ListNode splitK(ListNode head, int k) {
        ListNode[] dummy = new ListNode[k];
        ListNode[] tail = new ListNode[k];
        System.out.println();
        int length = 0;
        length = length(head);
        int rem = 0;
        rem = length % k;
        for (int i = 0; i < k; i++) {
            dummy[i] = new ListNode(i);
            tail[i] = dummy[i];
        }
        ListNode curr = head;
        int idx = 0;
        int count = 0;
        while (curr != null && idx < k) {
            int currTargetSize = (idx < rem)
                    ? (length / k + 1)
                    : (length / k);

            if (count >= currTargetSize) {
                count = 0;
                idx++;
                continue;
            }
            tail[idx].next = curr;
            tail[idx] = curr;
            curr = curr.next;
            tail[idx].next = null;
            count++;
        }

        for (int i = 0; i < k; i++) {
            ListNode dummyNode = dummy[i];
            dummy[i] = dummy[i].next;
            dummyNode = null;
        }

        return dummy[0];
    }

    public static int length(ListNode head) {
        int cnt = 0;
        while (head != null) {
            head = head.next;
            cnt++;
        }
        return cnt;
    }
}
