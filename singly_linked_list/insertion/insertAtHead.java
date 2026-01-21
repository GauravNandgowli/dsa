package insertion;

import util.LL_Util;
import util.ListNode;

public class insertAtHead {
    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        System.out.println(insert(head, 6));
    }

    public static ListNode insert(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            newNode.next = null;
            head = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;

    }
}
