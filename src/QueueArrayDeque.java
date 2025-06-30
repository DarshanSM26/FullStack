import java.util.ArrayDeque;

public class QueueArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.add(1);
        deque.offerFirst(5);
        deque.offerLast(10);
        deque.offer(30);
        deque.addFirst(20);
        deque.addLast(15);
        System.out.println(deque);
        deque.pop();
        System.out.println(deque);
        deque.push(22);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
