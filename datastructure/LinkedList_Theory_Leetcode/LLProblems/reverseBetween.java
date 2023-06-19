package datastructure.LLProblems;

//https://leetcode.com/problems/reverse-linked-list-ii/

public class reverseBetween {
    ListNode head;
    private class ListNode{
        int val;
        ListNode next;

        public ListNode(int value){
            this.val = value;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;

        ListNode present = head;
        ListNode prev = null;

        for (int i = 0; present != null && i< left - 1; i++){   //bringing prev to last node before sub-list and pres at first node
            prev = present;
            present = present.next;
        }

        ListNode last = prev;   //being the last node before the sub-list begins
        ListNode newEnd = present;  //being the first node of the sublist before reversal, last node after reversal (connects to the tail *tail doesn't exist*)

        //reverse
        ListNode next = present.next;
        for(int i = 0; present != null && i < right - left +1; i++){ //iterates the prev, pres and next nodes through the sub-set. 
                                                                    //prev ends at last node of sub-set, pres at first node after subset
            present.next = prev;
            prev = present;
            present = next;

            if( next != null) next = next.next;
        }

        if(last != null){
            last.next = prev;   //connects the reverse subset to "last" node (the last node before subset started)
        } else head = prev;

        newEnd.next = present;  //connects the last node of subset to the first node After the subset ended
        return head;
    }
}
