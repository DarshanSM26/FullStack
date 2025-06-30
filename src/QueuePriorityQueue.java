import java.util.PriorityQueue;

public class QueuePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.offer("Ram");
        queue.add("Sanjay");
        queue.offer("Ramesh");
        queue.add("Darshan");
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
