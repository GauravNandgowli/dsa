package splitList;

import java.util.ArrayList;
import java.util.List;

import util.LL_Util;
import util.ListNode;

public class evenOddSplit {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ListNode head = LL_Util.fromArray(input);

        List<ListNode> enumer = splitEO(head);
        System.out.println(enumer);
        ListNode curr = enumer.get(1);
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static List<ListNode> splitEO(ListNode head) {
        ArrayList<ListNode> res = new ArrayList<>();

        if (head == null) {
            res.add(null);
            res.add(null);
            return res;
        }

        ListNode curr = head;
        ListNode[] dummy = new ListNode[2];
        ListNode[] tail = new ListNode[2];

        for (int i = 0; i < 2; i++) {
            dummy[i] = new ListNode(0);
            tail[i] = dummy[i];
        }
        int idx = 0;
        while (curr != null) {
            if (curr.val % 2 == 0) {
                idx = 0;
            } else {
                idx = 1;
            }

            tail[idx].next = curr;
            tail[idx] = curr;
            curr = curr.next;
            tail[idx].next = null;

        }
        for (int i = 0; i < 2; i++) {
            ListNode dummyNode = dummy[i];
            dummy[i] = dummy[i].next;
            dummyNode = null;
        }
        res.add(dummy[0]);
        res.add(dummy[1]);
        return res;
    }

}
