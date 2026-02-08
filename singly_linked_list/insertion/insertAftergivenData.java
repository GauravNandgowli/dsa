import util.LL_Util;
import util.ListNode;

public class insertAftergivenData {

    public static void main(String[] args) {
        int[] input = { 5, 7, 3, 10 };
        ListNode head = LL_Util.fromArray(input);

        ListNode res = insert(head, 5, 6);

        for (ListNode curr = res; curr != null; curr = curr.next) {
            System.out.println(curr.val);
        }
    }

    public static ListNode insert(ListNode head, int data, int val) {
        ListNode newNode = new ListNode(val);

        ListNode curr = head;
        if (head == null)
            return head;
        while (curr != null) {

            if (curr.val == data) {
                newNode.next = curr.next;
                curr.next = newNode;
                return head;
            }
            curr = curr.next;
        }

        return head;
    }
}
