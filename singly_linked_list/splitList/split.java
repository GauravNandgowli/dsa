package splitList;

import util.LL_Util;
import util.ListNode;

public class split {

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
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
        ListNode curr = head;
        int idx = 0;
        int count = 0;
        System.out.println();
        while (curr != null) {
            idx = calcIndex(count, k);
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

    public static int calcIndex(int count, int k) {
        return count % k;
    }
}
