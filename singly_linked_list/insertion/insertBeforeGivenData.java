import util.LL_Util;
import util.ListNode;

public class insertBeforeGivenData {

    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        ListNode res = insert(head, 11, 6);

        for (ListNode curr = res; curr != null; curr = curr.next) {
            System.out.println(curr.val);
        }
    }

    public static ListNode insert(ListNode head, int data, int val) {
        ListNode newNode = new ListNode(val);

        if (head == null)
            return head;

        if (head.val == data) {
            newNode.next = head;
            return newNode;
        }

        ListNode curr = head;
        // ListNode prev = null;
        // while (curr != null) {
        // if (curr.val == data) {
        // newNode.next = prev.next; // || newNode.next = curr;
        // prev.next = newNode;
        // return head;
        // }
        // prev = curr;
        // curr = curr.next;
        // }

        while (curr != null) {
            if (curr.next != null && curr.next.val == data) {
                newNode.next = curr.next;
                curr.next = newNode;
                return head;
            }
            curr = curr.next;
        }

        return head;
    }
}
