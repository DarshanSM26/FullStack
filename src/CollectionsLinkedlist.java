import java.util.LinkedList;
import java.util.List;

public class CollectionsLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Darshan");
        ll.add("sanjay");
        ll.add("soujanya");
        ll.add("maohanr");
        ll.add("raj");
        ll.addFirst("Ram");
        System.out.println(ll);
        ll.addLast("Ramesh");
        System.out.println(ll);
        ll.set(2,"karthik");
        System.out.println(ll);
        System.out.println(ll.get(0));
        System.out.println(ll.contains("darshan"));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        ll.clear();
        System.out.println(ll);

    }
}
