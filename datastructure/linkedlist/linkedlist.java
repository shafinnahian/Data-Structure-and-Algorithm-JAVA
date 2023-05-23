package datastructure.linkedlist;

public class linkedlist{

    private Node head;
    private Node tail;

    private int size;

    public linkedlist(){
        this.size = 0;
    }


    private class Node{
        private int val;
        private Node next;
        
        public Node(int value){
            this.val= value;
        }

        public Node(int value, Node next){
            this.val = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node= new Node(value);
        node.next= head;
        head = node;

        if(tail == null) tail = head;
        size++;

    }

    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        } 

        Node node = new Node(value);

        tail.next = node;
        tail = node;
        size++;
    }



    public void display(){
        Node temp = head;

        while( temp != null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.println("End.");
    }
    public static void main(String args[]){

    }
}
