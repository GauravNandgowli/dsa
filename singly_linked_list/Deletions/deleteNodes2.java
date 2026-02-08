import util.LL_Util;
import util.ListNode;

public class deleteNodes2 {
    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10, 2, 3, 3, 3, 4, 5 };
        ListNode head = LL_Util.fromArray(input);

        ListNode enumer = deleteNodesWithGivenData(head, 3);
        ListNode curr = enumer;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }

    public static ListNode deleteNodesWithGivenData(ListNode head, int data) {
        while (head != null && head.val == data)
            head = head.next;
        if (head == null)
            return null;

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            if (curr.val == data) {
                prev.next = curr.next;
            } else
                prev = curr;
            curr = curr.next;
        }

        return head;
    }
}
