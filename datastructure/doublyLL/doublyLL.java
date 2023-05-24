package datastructure.doublyLL;

public class doublyLL {

    Node head;
    Node tail;

    int size;

    public doublyLL(){
        this.size=0; 
    }
    
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int value){
            this.val= value;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if (head != null) head.prev = node;

        head = node;
        // if (tail == null) tail = head;

        this.size++;
    }

    public void addLast(int value){
        Node temp = head;
        Node node = new Node(value);

        while(temp.next != null) temp = temp.next;

        temp.next = node;
        node.prev = temp;

        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End.");
    }

    public void displayRev(){
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("Start");
    }
}
