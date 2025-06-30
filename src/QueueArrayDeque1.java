import java.util.ArrayDeque;

public class QueueArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> deque=new ArrayDeque<>();
        deque.add("Darshan");
        deque.offer("Raj");
        deque.add("Shiva");
        deque.offerFirst("darshan");
        deque.offerLast("shiva");
        deque.addFirst("Shiva");
        deque.addLast("raj");
        System.out.println(deque);
        System.out.println(deque.size());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peek());
        System.out.println(deque.pop());
        System.out.println(deque.poll());
        deque.push("Ramesh");
        System.out.println(deque);
        System.out.println(deque.size());
        System.out.println(deque.contains("ram"));
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
