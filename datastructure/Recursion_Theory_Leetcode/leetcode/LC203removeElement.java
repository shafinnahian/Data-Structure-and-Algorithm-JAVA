package Recursion_Theory_Leetcode.leetcode;


public class LC203removeElement {
        public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode recurrHead = removeElements (head.next, val);

        if(head.val == val) {
            return recurrHead;
        }

        head.next = recurrHead;
        return head;
    }  


public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
