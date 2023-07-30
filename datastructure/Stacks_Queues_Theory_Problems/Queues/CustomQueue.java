package Queue;

public class CustomQueue {
    protected static final int DEFAULT_SIZE = 10;
    private int[] data;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if (isFull()) return false;

        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty.");
        }

        int remove = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;

        return remove;
    }
    public int peekFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty.");
        }

        return data[0];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty.");
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("End");
    }
}
