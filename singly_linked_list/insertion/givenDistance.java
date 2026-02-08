
import util.LL_Util;
import util.ListNode;

public class givenDistance {
  public static void main(String[] args) {
    int[] input = { 5, 7, 3, 10 };
    ListNode head = LL_Util.fromArray(input);

    ListNode res = insert(head, 10, 6);

    for (ListNode curr = res; curr != null; curr = curr.next) {
      System.out.println(curr.val);
    }
  }

  public static ListNode insert(ListNode head, int pos, int data) {
    ListNode newNode = new ListNode(data);
    int idx = 0;
    if (head == null)
      return head;
    if (pos == 0) {
      newNode.next = head;
      head = newNode;
      return head;
    }

    ListNode curr = head;
    ListNode prev = null;

    while (curr != null && (idx <= pos - 1)) {
      prev = curr;
      curr = curr.next;
      idx++;
    }
    if (idx != pos)
      return head;
    newNode.next = prev.next;
    prev.next = newNode;
    return head;
  }
}
