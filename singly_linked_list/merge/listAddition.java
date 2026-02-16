package merge;

import util.LL_Util;
import util.ListNode;

public class listAddition {
    public static void main(String[] args) {

        int[] inputOne = { 2, 4, 3 };
        ListNode headOne = LL_Util.fromArray(inputOne);
        int[] inputTwo = { 5, 6, 4 };
        ListNode headTwo = LL_Util.fromArray(inputTwo);

        ListNode enumer = merge(headOne, headTwo);
        ListNode curr = enumer;
        System.out.println();
        while (curr != null) {
            // System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static ListNode merge(ListNode headOne, ListNode headTwo) {
        if (headOne == null && headTwo == null)
            return new ListNode(0);
        if (headOne == null)
            return headTwo;
        if (headTwo == null)
            return headOne;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode curr1 = headOne;
        ListNode curr2 = headTwo;
        ListNode carry = new ListNode(0);
        int sum = 0;

        while (curr1 != null && curr2 != null) {
            ListNode value = new ListNode(0);
            sum = curr1.val + curr2.val + carry.val;
            if (curr1.next == null || curr2.next == null) {
                value.val = sum % 10;
                sum = sum / 10;
                carry.val = sum;
                if (carry.val != 0)
                    value.next = carry;
                tail.next = value;
                tail = value;
                return dummy.next;
            }
            value.val = sum % 10;
            sum = sum / 10;
            carry.val = sum;
            tail.next = value;
            tail = value;
            System.out.println(sum);
            curr1 = curr1.next;
            curr2 = curr2.next;

        }
        return dummy.next;
    }

}
