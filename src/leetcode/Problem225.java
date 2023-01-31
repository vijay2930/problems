package leetcode;
import java.util.Queue;
import java.util.LinkedList;
class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            System.out.println("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int result = queue1.remove();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return result;
    }

    public int top() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            System.out.println("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int result = queue1.peek();
        queue2.add(queue1.remove());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return result;
    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
public class Problem225 {
    
}
