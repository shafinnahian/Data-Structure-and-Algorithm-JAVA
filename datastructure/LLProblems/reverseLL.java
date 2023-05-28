package datastructure.LLProblems;

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
