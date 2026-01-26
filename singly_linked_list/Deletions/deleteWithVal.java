import util.LL_Util;
import util.ListNode;

public class deleteWithVal {
  public static void main(String[] args) {
    int[] input = { 5, 7, 3, 10 };
    ListNode head = LL_Util.fromArray(input);

    System.out.println(deleteNodeWithGivenData(head, 6));

  }

  public static ListNode deleteNodeWithGivenData(
      ListNode head,
      int givenData) {
    if (head == null)
      return null;

    if (head.val == givenData) {
      head = head.next;
      return head;
    }

    ListNode curr = head;
    ListNode prev = null;

    while (curr.next != null && curr.val != givenData) {
      prev = curr;
      curr = curr.next;
    }
    if (curr.val != givenData)
      return head;
    prev.next = curr.next;
    curr = null;

    return head;
  }
}
