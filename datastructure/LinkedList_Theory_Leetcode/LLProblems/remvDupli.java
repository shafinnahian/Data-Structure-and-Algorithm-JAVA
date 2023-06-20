package LinkedList_Theory_Leetcode.LLProblems;

public class remvDupli {
    
}
//   Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        ListNode node = head;

        while (node.next != null){
            if (node.val == node.next.val){
                node.next = node.next.next;
            } else{
                node = node.next;
            }
        }
        return head;
    }
}
