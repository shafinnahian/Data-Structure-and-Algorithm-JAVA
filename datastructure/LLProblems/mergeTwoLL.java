package datastructure.LLProblems;

public class mergeTwoLL {
    
}
//https://leetcode.com/problems/merge-two-sorted-lists/
//https://leetcode.com/problems/merge-two-sorted-lists/solutions/3562559/0ms-beating-100-runtime-415mb-beating-981-memory-java-solution/


//   Definition for singly-linked list.
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1: list2;
        return dummyHead.next;
    }
}
