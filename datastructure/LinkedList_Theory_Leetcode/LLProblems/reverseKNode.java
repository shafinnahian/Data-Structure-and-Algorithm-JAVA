package LinkedList_Theory_Leetcode.LLProblems;

// Leetcode 25
// https://leetcode.com/problems/reverse-nodes-in-k-group/
//https://leetcode.com/problems/reverse-nodes-in-k-group/solutions/3573306/simple-iterative-java-solve-explained-step-by-step/

public class reverseKNode {
     public ListNode reverseKGroup(ListNode head, int k){
        if (k == 1 || head == null) return head;
        if (head.next.next == null){
            ListNode curr = head.next;
            ListNode prev = head;

            curr.next = prev;
            prev.next = null;
            head = curr;

            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while(true){
            ListNode last = prev;
            ListNode newLast = current; 

            ListNode next = current.next;
            for(int i = 1; current.next != null && i <= k; i++){
                current.next = prev;
                prev = current;
                current = next;
    
                if( next != null) next = next.next;
            }
    
            if(last != null){
                last.next = prev;
            } else head = prev;
    
            newLast.next = current;

            if(current.next == null) break;

            prev = newLast;        
        }
        return head;

    }
    
}
