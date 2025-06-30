import java.util.LinkedList;

public class CollectionsLinkedlistPhonenumber {
    public static void main(String[] args) {
        LinkedList<Integer> pn=new LinkedList<>();
        pn.addFirst(888);
        pn.add(44);
        pn.add(90);
        pn.addLast(770);
        System.out.println(pn);
        pn.set(3,4);
        System.out.println(pn);
        System.out.println(pn.getLast());
        System.out.println(pn.getFirst());
        System.out.println(pn.contains(888));
        System.out.println(pn.set(3,9));
        System.out.println(pn.removeFirst());
        System.out.println(pn.removeLast());
        pn.clear();
        System.out.println(pn);

    }
}
