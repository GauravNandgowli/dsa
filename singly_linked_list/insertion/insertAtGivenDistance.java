import util.LL_Util;
import util.ListNode;

public class insertAtGivenDistance {
    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        ListNode res = insert(head, 0, 6);

        for (ListNode curr = res; curr != null; curr = curr.next) {
            System.out.println(curr.val);
        }
    }

    public static ListNode insert(ListNode head, int X, int data) {
        ListNode newNode = new ListNode(data);
        int idx = 0;
        if (head == null) {
            if (X != 0)
                return head;
            newNode.next = head;
            head = newNode;
        } else if (X == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode curr = head;
            while (curr.next != null && idx < X - 1) {
                curr = curr.next;
                idx++;
            }
            if (curr.next == null && (X - 1 > idx))
                return head;
            newNode.next = curr.next;
            curr.next = newNode;
        }
        return head;
    }
}
