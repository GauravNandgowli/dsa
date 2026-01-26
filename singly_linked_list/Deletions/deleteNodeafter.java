import util.LL_Util;
import util.ListNode;

public class deleteNodeafter {

    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);
        ListNode node = new ListNode(3);
        System.out.println(deleteNodeAfterTheGivenNode(head, node));

    }

    public static ListNode deleteNodeAfterTheGivenNode(
            ListNode head,
            ListNode node) {
        if (head == null || node == null)
            return head;
        if (head.next == null)
            return head;

        ListNode next = head.next;
        ListNode curr = head;

        while (next != null) {

            if (next != null && curr == node) {
                curr.next = next.next;
                next = curr.next;
                curr = curr.next;
            }
            curr = next;
            if (curr != null)
                next = curr.next;

        }
        return head;

    }
}
