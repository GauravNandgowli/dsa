import util.LL_Util;
import util.ListNode;

public class palindrome {
    public static void main(String[] args) {
        int[] input = { 2, 2, 3, 2, 2 };
        ListNode head = LL_Util.fromArray(input);

        System.out.println(halve(head));

    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean halve(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        if (head.next.next == null) {
            if (head.val == head.next.val)
                return true;
        }
        ListNode fast = head;
        ListNode secList = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = secList;
            secList = secList.next;
            fast = fast.next.next;

        }

        if (fast != null) {
            secList = secList.next;
        }

        prev.next = null;
        secList = reverse(secList);

        ListNode pOne = head;
        ListNode pTwo = secList;
        while (pOne != null && pTwo != null) {

            if (pOne.val != pTwo.val)
                return false;

            pOne = pOne.next;
            pTwo = pTwo.next;
        }
        System.out.println();
        return true;
    }
}
