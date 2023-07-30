package Stacks;

public class CustomStack {
    protected int[] data;   //https://chat.openai.com/share/cd318471-1606-4556-8567-dcbd979e0db5
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE); // it is calling CustomStack(int size) constructor
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;

        return true;
    }

    private boolean isFull(){
        return ptr == data.length - 1; //ptr at last idx
    }

    private boolean isEmpty(){
        return ptr == -1;
    }
    
    public int pop() throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }

        // int remove = data[ptr];
        // ptr--;

        // return remove;
        return data[ptr--];
    }

    public int peek() throws StackException{  // to see what is at the top
        if (isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }
}
