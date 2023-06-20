package LinkedList_Theory_Leetcode.LLProblems;
//https://leetcode.com/problems/sort-list/description/
//https://leetcode.com/problems/sort-list/solutions/3654507/easy-explanation-in-java/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class sortList {

    public ListNode sortList(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }
    
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
    
    ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null)? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;

        return mid;
    }
}
