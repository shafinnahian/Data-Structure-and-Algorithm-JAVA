package LinkedList_Theory_Leetcode.LLProblems;
//https://leetcode.com/problems/linked-list-cycle-ii/description/
//https://leetcode.com/problems/linked-list-cycle-ii/solutions/3569642/1ms-runtime-beats-100-java-solution-explained/

public class LLCycleTwo {
    Node head;
    Node tail;

    private class Node{
        int val;
        Node next;

        public Node (int value){
            this.val = value;
        }
    }

    public int lengthCounter(Node node){
        Node fast = node;
        Node slow = node;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast){
                int counter =0 ;
                Node temp = slow;

                do{
                    temp = temp.next;
                    counter++;
                } while (temp !=slow);

                return counter;
            }
        }

        return 0;
    }

    public Node hasCycle(Node node){

        int length = 0; 
        Node fast = node;
        Node slow = node;

        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                length = lengthCounter(slow);
                break;
            }
        }

        Node p1 = head;
        Node p2 = head;

        while (length > 0){
            p2 = p2.next;
            length--;
        }

        //keep moving forward they will meet at cycle start, that is our "k" time iteration
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}
