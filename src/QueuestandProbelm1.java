import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuestandProbelm1 {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        PriorityQueue<String> pq=new PriorityQueue<>();
        queue.offer("Darshan");
        queue.offer("Abhi");
        queue.offer("Sanjay");
        System.out.println(queue);

        while (!queue.isEmpty()){
            pq.offer(queue.poll());
        }
        System.out.println(pq);

    }
}
