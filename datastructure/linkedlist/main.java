package datastructure.linkedlist;

import datastructure.doublyLL.doublyLL;

public class main {
    public static void main(String args[]){
        // linkedlist list = new linkedlist(); 
        // list.insertFirst(5);
        // list.insertFirst(4);
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(1);  
        // list.display();

        // list.insertLast(90);
        // list.display();

        // list.insert(24,3 );
        // list.display();

        // list.deleteFirst();
        // list.display();

        // list.deleteLast();
        // list.display();

        // System.out.println("The size of the list is: "+list.size);
        // list.delete(3);
        // list.display();

        doublyLL list = new doublyLL();
        list.addFirst(5);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(8);
        list.addFirst(17);
        list.addLast(6);
        list.display();
        // list.displayRev();
        list.add(18, 4);
        list.display();
    }
    
}
