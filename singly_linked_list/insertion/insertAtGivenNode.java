/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * };
 */

class Solution {
    public void insertAfterTheGivenNode(ListNode node, int data) {
        ListNode newNode = new ListNode(data);
        if (node == null) {
            newNode.next = null;
            node = newNode;

        } else {

            newNode.next = node.next;
            node.next = newNode;
System.out.println("Hello");
        }

    }
}
