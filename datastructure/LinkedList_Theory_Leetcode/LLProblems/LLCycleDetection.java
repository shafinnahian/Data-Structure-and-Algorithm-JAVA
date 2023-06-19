package datastructure.LLProblems;
//https://leetcode.com/problems/linked-list-cycle/description/
//https://leetcode.com/problems/linked-list-cycle/solutions/3654362/runtime-0ms-beat-100-java-easy-explanation/

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
