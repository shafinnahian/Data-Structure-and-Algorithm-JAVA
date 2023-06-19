package datastructure.LLProblems;

//https://leetcode.com/problems/reverse-linked-list/description/
//https://leetcode.com/problems/reverse-linked-list/solutions/3569892/beat-100-runtime-9276-memory-java-explained-step-by-step/

public class reverseLL {
    Node head;

    private class Node{
        int val;
        Node next;
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
}
