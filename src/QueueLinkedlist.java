import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedlist {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Darshan");
        queue.offer("Shiva");
        queue.offer("Sanjay");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
    }
}
