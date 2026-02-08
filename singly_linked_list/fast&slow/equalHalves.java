// package fast&slow;

import java.util.ArrayList;

import util.LL_Util;
import util.ListNode;

public class equalHalves {
    public static void main(String[] args) {
        int[] input = { 1, 9, 2, 8 };
        ListNode head = LL_Util.fromArray(input);

        System.out.println(halve(head));

    }

    public static boolean halve(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        if (head.next.next == null) {
            if (head.val == head.next.val)
                return true;
        }
        ListNode fast = head;
        ListNode secList = head;
        ListNode prev = null;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        while (fast != null && fast.next != null) {
            sumFirstHalf = sumFirstHalf + secList.val;
            prev = secList;
            secList = secList.next;
            fast = fast.next.next;

        }

        if (fast != null) {
            sumFirstHalf = sumFirstHalf + secList.val;
            prev = secList;
            secList = secList.next;
        }
        System.out.println();
        System.out.println("Sum of 1st half is :" + sumFirstHalf);
        prev.next = null;
        ListNode curr = secList;
        while (curr != null) {
            sumSecondHalf = sumSecondHalf + curr.val;
            curr = curr.next;
        }
        System.out.println("Sum of 2nd half is :" + sumSecondHalf);
        if (sumFirstHalf == sumSecondHalf)
            return true;
        return false;
    }
}