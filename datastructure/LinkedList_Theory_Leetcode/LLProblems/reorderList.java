package LinkedList_Theory_Leetcode.LLProblems;

//leetcode 143. 
//https://leetcode.com/problems/reorder-list/description/
// https://leetcode.com/problems/reorder-list/solutions/3573200/java-beat-100-runtime-explained-easy-step-by-step/

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
