package LinkedList_Theory_Leetcode.LLProblems;
//https://leetcode.com/problems/palindrome-linked-list/
//https://leetcode.com/problems/palindrome-linked-list/solutions/3570164/java-easy-explanation-step-by-step/

public class isPalindrome {
    Node head;

    private class Node{
        int val;
        Node next;

        public Node(int value){
            this.val = value;
        }
        public Node (){

        }
    }

    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
        }
    
    public Node reversal(Node node){

        if (head == null || head.next == null){
            return head;
        }
        Node prev = new Node();
        prev = null;
        Node pres = head;
        Node nxt = head.next;

        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = nxt;

            if (nxt != null){
                nxt = nxt.next;
            }
        }
        head = prev;
        return head;
    }
    
    public boolean isPalindrome(Node head){
        Node mid = middleNode(head);
        Node headSNode = reversal(mid);
        Node rereversNode = headSNode;

        //compare both the halves
        while (head != null && headSNode != null){
            if(head.val != headSNode.val) break;

            head = head.next;
            headSNode = headSNode.next;
        }

        reversal(rereversNode);

        if (head == null || headSNode == null) return true;

        return false;
    }
        
}
