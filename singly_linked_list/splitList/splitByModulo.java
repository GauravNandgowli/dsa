package splitList;

import java.util.ArrayList;
import java.util.List;

import util.LL_Util;
import util.ListNode;

public class splitByModulo {
    public static void main(String[] args) {
        int[] input = { 5, 2, 3, 10, 6, 8 };
        ListNode head = LL_Util.fromArray(input);

        List<ListNode> enumer = splitByMod(head, 3);
        System.out.println(enumer);
        ListNode curr = enumer.get(2);
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static List<ListNode> splitByMod(ListNode head, int k) {
        ArrayList<ListNode> res = new ArrayList<>();

        if (head == null) {
            res.add(null);
            res.add(null);
            return res;
        }
        ListNode[] dummy = new ListNode[k];
        ListNode[] tail = new ListNode[k];

        for (int i = 0; i < k; i++) {
            dummy[i] = new ListNode(0);
            tail[i] = dummy[i];
        }
        ListNode curr = head;
        int idx = 0;

        while (curr != null) {
            idx = curr.val % k;
            tail[idx].next = curr;
            tail[idx] = curr;
            curr = curr.next;
            tail[idx].next = null;

        }
        for (int i = 0; i < k; i++) {
            ListNode dummyNode = dummy[i];
            dummy[i] = dummy[i].next;
            dummyNode = null;
        }
        for (int i = 0; i < k; i++) {
            res.add(dummy[i]);
        }
        return res;
    }
}
