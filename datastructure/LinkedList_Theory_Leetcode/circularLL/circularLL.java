package LinkedList_Theory_Leetcode.circularLL;

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

    public Node find(int value){
        Node node = head;

        while( node.next != head ){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void delete(int value){
        Node nodeDel = find(value);

        if(nodeDel == null) return;
        else if (nodeDel == head){
            tail.next = head.next;
            head = head.next;

            return;
        }

        Node temp = head;

        while (temp.next != head){
            if (temp.next == nodeDel){
                temp.next = nodeDel.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void display(){
        Node node = head;

        if ( head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("Head");
    }
}
