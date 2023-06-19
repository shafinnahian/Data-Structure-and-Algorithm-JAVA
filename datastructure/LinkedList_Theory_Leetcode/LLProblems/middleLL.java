package datastructure.LLProblems;


public class middleLL {

    ListNode head;
    ListNode tail;

    private class ListNode{
        int val;
        ListNode next;

        public ListNode(int value){
            this.val = value;
        }
        public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
        }   
    }
}
