package merge;

import util.LL_Util;
import util.ListNode;

public class listAddition {
    public static void main(String[] args) {

        int[] inputOne = { 1, 2, 3, 6, 7 };
        ListNode headOne = LL_Util.fromArray(inputOne);
        int[] inputTwo = { 4, 5, 8, 9, 10 };
        ListNode headTwo = LL_Util.fromArray(inputTwo);

        ListNode enumer = merge(headOne, headTwo);
        ListNode curr = enumer;
        System.out.println();
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static ListNode merge(ListNode headOne, ListNode headTwo) {
        if (headOne == null)
            return headTwo;
        if (headTwo == null)
            return headOne;
        if (headOne == null && headTwo == null)
            return new ListNode(0);

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode curr1 = headOne;
        ListNode curr2 = headTwo;
        ListNode carry = new ListNode(0);
        int sum = 0;

        while (curr1 != null && curr2 != null) {
            // if(curr1.next != null && curr2.next != null)
            sum = curr1.val + curr2.val + carry.val;


        

        //     if (decider(curr1, curr2)) {
        //         ListNode next = curr1.next;
        //         curr1.next = tail;
        //         tail = curr1;
        //         curr1 = next;
        //     } else {
        //         ListNode next = curr2.next;
        //         curr2.next = tail;
        //         tail = curr2;
        //         curr2 = next;
        //     }
        // }
        // if (curr1 != null) {
        //     while (curr1 != null) {
        //         ListNode next = curr1.next;
        //         curr1.next = tail;
        //         tail = curr1;
        //         curr1 = next;
        //     }
        // } else if (curr2 != null) {
        //     while (curr2 != null) {
        //         ListNode next = curr2.next;
        //         curr2.next = tail;
        //         tail = curr2;
        //         curr2 = next;
        //     }

        // }
        return dummy.next;
    }

    public static boolean decider(ListNode curr1, ListNode curr2) {
        if (curr1.val <= curr2.val)
            return true;
        else
            return false;

    }
}
