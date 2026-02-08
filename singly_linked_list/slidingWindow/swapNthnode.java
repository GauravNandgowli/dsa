package slidingWindow;

import util.LL_Util;
import util.ListNode;

public class swapNthnode {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5 };
        ListNode head = LL_Util.fromArray(input);

        ListNode enumer = swap(head, 2);
        ListNode curr = enumer;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static ListNode swap(ListNode head, int k) {
        ListNode secondNode = head;
        ListNode prevOfSecondNode = null;
        ListNode prevOfFirstNode = null;
        ListNode firstNode = head;
        ListNode end = head;
        ListNode start = head;

        for (int i = 1; i < k; i++) {
            if (end == null)
                return head;
            prevOfFirstNode = end;
            end = end.next;
        }
        firstNode = end;

        while (end != null && end.next != null) {
            prevOfSecondNode = start;
            start = start.next;
            end = end.next;
        }
        secondNode = start;

        if (firstNode == secondNode)
            return head;

        if (prevOfFirstNode != null)
            prevOfFirstNode.next = secondNode;
        else
            head = secondNode;

        if (prevOfSecondNode != null)
            prevOfSecondNode.next = firstNode;
        else
            head = firstNode;

        ListNode temp = firstNode.next;
        firstNode.next = secondNode.next;
        secondNode.next = temp;

        return head;

    }
}
