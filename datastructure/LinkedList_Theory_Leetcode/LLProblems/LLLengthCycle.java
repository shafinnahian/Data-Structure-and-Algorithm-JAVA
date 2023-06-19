package datastructure.LLProblems;

public class LLLengthCycle {

    Node head;
    Node tail;

    private class Node {
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
    
}
