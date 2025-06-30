import java.util.PriorityQueue;

public class QueuePriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.add(5);
        queue.offer(6);
        queue.add(10);
        queue.offer(39);
        queue.offer(40);
        queue.add(1);
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
