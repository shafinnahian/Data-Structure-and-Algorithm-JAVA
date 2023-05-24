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
}
