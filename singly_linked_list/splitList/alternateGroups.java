package splitList;

import java.util.ArrayList;
import java.util.List;

import util.LL_Util;
import util.ListNode;

public class alternateGroups {
    public static void main(String[] args) {
        int[] input = { 6, 1, 3, 10, 6, 8, 9 };
        ListNode head = LL_Util.fromArray(input);

        List<ListNode> enumer = alternateGRP(head, 8);
        System.out.println(enumer);
        ListNode curr = enumer.get(0);
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static List<ListNode> alternateGRP(ListNode head, int k) {
        ArrayList<ListNode> res = new ArrayList<>();

        if (head == null) {
            res.add(null);
            res.add(null);
            return res;
        }
        ListNode[] dummy = new ListNode[2];
        ListNode[] tail = new ListNode[2];

        for (int i = 0; i < 2; i++) {
            dummy[i] = new ListNode(0);
            tail[i] = dummy[i];
        }
        ListNode curr = head;
        int idx = 0;
        int count = 0;

        while (curr != null) {
            tail[idx].next = curr;
            tail[idx] = curr;
            curr = curr.next;
            tail[idx].next = null;
            count++;
            if (count == k) {
                count = 0;
                idx = (idx == 1) ? 0 : 1;
            }
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
