import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedlist1 {
    public static void main(String[] args) {
        Queue<Integer> num=new LinkedList<>();
        num.add(1);
        num.offer(2);
        num.add(3);
        num.offer(4);
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.peek());
        System.out.println(num.size());
        System.out.println(num.poll());
        System.out.println(num.remove());
        System.out.println(num.contains(1));
        System.out.println(num);
        num.clear();
        System.out.println(num);
    }
}
