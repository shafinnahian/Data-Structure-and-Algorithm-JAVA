package datastructure.LLProblems;


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

        for (int i = 0; present != null && i< left - 1; i++){
            prev = present;
            present = present.next;
        }

        ListNode last = prev;
        ListNode newEnd = present;

        //reverse
        ListNode next = present.next;
        for(int i = 0; present != null && i < right - left +1; i++){
            present.next = prev;
            prev = present;
            present = next;

            if( next != null) next = next.next;
        }

        if(last != null){
            last.next = prev;
        } else head = prev;

        newEnd.next = present;
        return head;
    }
}
