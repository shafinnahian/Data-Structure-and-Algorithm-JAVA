package datastructure.linkedlist;


public class main {
    public static void main(String args[]){
        linkedlist list = new linkedlist(); 
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);  
        list.display();

        list.insertLast(90);
        list.display();

        list.insert(24,3 );
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        System.out.println("The size of the list is: "+list.size);
        list.delete(3);
        list.display();
    }
    
}
