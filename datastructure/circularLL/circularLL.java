package datastructure.circularLL;

public class circularLL {  
    Node head;  
    Node tail;

    public circularLL(){
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int val;

        Node next;
        Node prev;

        public Node(int value){
            this.val = value;
        }
    }
    
    public void add(int value){
        Node node = new Node (value);

        if (head == null){
            head = node;
            tail = node;

            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }
}
