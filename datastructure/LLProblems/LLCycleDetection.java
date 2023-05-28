package datastructure.LLProblems;


public class LLCycleDetection {

    Node head;
    Node tail;
    
    private class Node {

        int val;
        Node next;
        public Node (int value){
            this.val = value;
        }
    }

    public boolean hasCycle(Node node){
        Node fast = node;
        Node slow = node;

        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) return true;
        }

        return false;
    }
}
