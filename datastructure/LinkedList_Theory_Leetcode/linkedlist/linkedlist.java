package LinkedList_Theory_Leetcode.linkedlist;

public class linkedlist{

    private Node head;
    private Node tail;

    public int size;

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

    public void insert(int value, int index){
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }

        Node temp = new Node (value);
        Node node = new Node (value);

        temp = head;

        for(int i = 1; i <= index; i++){
            if(i == index){
                node.next = temp.next;
                temp.next= node;
                size++;
                return;
            }
            temp = temp.next;
        }
        //alternative solution:
        // Node temp = head;
        // for ( int i = 1; i < index; i++) temp = temp.next;

        // Node node = new Node(value, temp.next);
    }

    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index; i++) node = node.next;

        return node;
    }

    public Node findNode(int value){
        Node node = head;

        while(node != null){
            if (node.val == value) return node;
            node=node.next;
        }
        return null;
    }

    public void insertRec(int val, int idx){
        head = insertRec(val, idx, head); //ensures the recursion beginning and ending at head
    }

    private Node insertRec(int val, int idx, Node node){
        if (idx == 0 ){
            Node temp = new Node (val, node); //if condition is met temp will connect to next node
                                            // for 3 -> 5 -> 9 -> (7) -> 1 with idx = 0, it will connect (7) -> 1.
            size++;

            return temp; //returns the newly connected node to be connected with the previous node 9 -> 7
        }

        node.next = insertRec(val, --idx, node.next); //each iteration idx deducts till reaching 0. It then meets the above condition
        return node; //returns the current node after each recursive function is completed. 
                    //for third iteration in 3 -> 5 -> 9 -> (7) -> 1 it will return 9 after connecting to new node (7).
                    // for second iteration's completion, it will return 5 after being called to connect with 9 again. This will continue till it meets head (previous method, right above)
    }

    public void deleteFirst(){
        head = head.next;

        if(head == tail) tail = null;

        size--;
    }

    public void deleteLast(){
        Node temp = head;
        
        for (int i=0; i <= size; i++){
            if(i==size-2){
                temp.next=null;
                tail=temp;
                size--;
                return;
            }
            temp = temp.next;
        }
        
        // alternative solution
        // Node secondLast = get(size-2);
        // tail = secondLast;
        // tail.next = null;

    }

    public void delete(int index){
        if (index == 0){
            deleteFirst();
            return;
        }
        if (index == size){
            deleteLast();
            return;
        }

        Node prev = get(index - 1);
        prev.next = prev.next.next;
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
