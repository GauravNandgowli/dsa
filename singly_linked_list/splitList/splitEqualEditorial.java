package splitList;

import util.LL_Util;
import util.ListNode;

public class splitEqualEditorial {
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
        for (int i = 0; i < k; i++) {
            dummy[i] = new ListNode(i);
            tail[i] = dummy[i];
        }
        System.out.println();
        int length = 0;
        length = length(head);
        int rem = length % k;
        int subList = length / k;

        ListNode curr = head;
        int idx = 0;
        int count = 0;
        while (curr != null && idx < k) {
            tail[idx].next = curr;
            tail[idx] = curr;
            curr = curr.next;
            tail[idx].next = null;
            count++;

            if (rem > 0 && count == subList + 1) {
                idx++;
                count = 0;
                rem--;
            } else if (rem == 0 && count == subList) {
                idx++;
                count = 0;
            }

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
