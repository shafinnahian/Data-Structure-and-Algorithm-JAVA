package Problems;

//https://leetcode.com/problems/design-a-stack-with-increment-operation/solutions/3882568/beat-100-runtime-and-99-90-memory-java-explained/
public class LC1381CustomStack {
    int[] arr;
    int pointer = -1;
    public LC1381CustomStack(int maxSize) {
        arr = new int[maxSize];
    }

    public void push(int x) {
        if (pointer >= arr.length - 1) return;
        pointer ++;
        arr[pointer] = x;
    }

    public int pop() {
        if (pointer > arr.length) pointer--;
        else if (isEmpty()) return -1;
        return arr[pointer --];
    }

    public void increment(int k, int val) {
        if (k > pointer){
            for (int i = 0; i <= pointer; i++) {
                arr[i] += val;
            }
        }
        else{
            for (int i = 0; i < k; i++) {
                arr[i] += val;
            }
        }
    }
    private boolean isEmpty(){
        return pointer == -1;
    }
}
