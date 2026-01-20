package traversal;

import util.*;

public class nodeSearch {
    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);
        int data = 3;
        System.out.println(node_search(head, data));
    }

    public static ListNode node_search(ListNode head, int data) {
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == data)
                return curr;
            curr = curr.next;
        }

        return null;

    }
}
