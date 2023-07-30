package Queues;

public class QueueMain{
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue(5);

        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(22);
        queue.insert(1);

        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.insert(90);
        queue.display();
        queue.insert(133);
        queue.display();

//        System.out.println(queue.peekFirst());
    }
}
