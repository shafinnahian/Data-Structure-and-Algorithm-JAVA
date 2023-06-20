package LinkedList_Theory_Leetcode.LLProblems;


public class reverseRecursion {
    ListNode head;
    ListNode tail;
    private class ListNode{
        int val;
        ListNode next;
        public ListNode(int value){
            this.val = value;
        }
    }

    private void reverse (ListNode node){
        if (node == tail){
            head = tail;
            return;
        }

        reverse (node.next); //keeps calling next till the above condition is met
                            //then it backwards to connect and update tail and head
        tail.next = node;
        tail = node;
        tail.next = null;

    }
}
