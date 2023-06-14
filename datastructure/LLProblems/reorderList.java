package datastructure.LLProblems;

//leetcode 143. 
//https://leetcode.com/problems/reorder-list/description/

public class reorderList {
    public ListNode findMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head){
        if(head == null) return null;

        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = curr.next;

        do{
            curr.next = prev;
            prev = curr;
            curr = nxt;
            if( nxt != null ) nxt = nxt.next;
        } while (curr != null);
        return prev;
    }

    void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode midNode = findMid(head);
        ListNode hs = reverseList(midNode);
        ListNode hf = head;

        while (hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if( hf != null) hf.next = null;
    }
}
