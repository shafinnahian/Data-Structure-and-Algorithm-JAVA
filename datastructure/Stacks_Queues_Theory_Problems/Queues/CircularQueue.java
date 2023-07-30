package Stacks_Queues_Theory_Problems.Queues;

public class CircularQueue {
    protected static final int DEFAULT_SIZE = 10;
    protected int[] data;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if (isFull()) return false;

        data[end++] = item;
        end = end % data.length;
        size++;

        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty.");
        }

        int remove = data[front++];

        front = front % data.length;
        size--;

        return remove;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue Empty.");
        }
        return data[front];
    }

    public void display() throws Exception{
        if(isEmpty()) throw new Exception("Empty");

        int i = front;
        do{
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        } while( i != end);
        System.out.println("End");
    }
}
