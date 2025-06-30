import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStandProblem {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        queue.offer(8);
        queue.offer(1);
        queue.offer(0);
        queue.offer(4);
        System.out.println("Original queue :"+queue);

        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        System.out.println("Resvered queue :"+queue);
    }
}
