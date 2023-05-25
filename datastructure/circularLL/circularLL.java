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

    public void display(){
        Node node = head;

        if ( head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head)
        }
        System.out.println("END.")
    }
}
