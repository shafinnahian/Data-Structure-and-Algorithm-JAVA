package LinkedList_Theory_Leetcode.doublyLL;

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
        Node node = new Node(value);
        node.next = null;

        if (head == null){
            // Node temp = new Node (value);
            node.prev = null;
            head = node;

            size++; 

            return;
        }
        Node temp = head;

        while(temp.next != null) temp = temp.next;

        temp.next = node;
        node.prev = temp;

        size++;
    }

    public void add(int value, int idx){
        Node temp = head;
        Node node = new Node (value);

        for(int i = 1; i <= size; i++){
            if( i == idx-1){
                node.prev = temp;
                node.next = temp.next;
                temp.next = node;

                if(node.next != null) node.next.prev = node;
                
                break;
            }
            // if( i == idx){
            //     node.next = temp;
            //     temp.prev = node;

            //     break;
            // }
            temp = temp.next;
        }
        size++;
    }

    public Node find(int value){
        Node node = head;

        while (node != null){
            if(node.val == value) return node;
            node = node.next;
        }
        return null;
    }

    public void insert(int findVal, int value){
        Node temp = find(findVal);

        if (temp == null){
            System.out.println("Doesn't exist");
            return;
        }

        Node node = new Node (value);
        node.prev = temp;
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;

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
