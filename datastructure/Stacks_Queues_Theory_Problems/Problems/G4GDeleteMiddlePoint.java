package Problems;
import java.util.Stack;
public class G4GDeleteMiddlePoint {
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
    Stack<Integer> temp = new Stack<>();
    int mid = (sizeOfStack+1)/2;

    while (!s.isEmpty()){
        if (s.size() == mid) s.pop();

        temp.add(s.pop());
    }

    while (!temp.isEmpty()){
        s.add(temp.pop());
    }
    }
}
