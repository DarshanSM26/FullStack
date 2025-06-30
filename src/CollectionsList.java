import java.util.ArrayList;
import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {
        List<Integer> listname=new ArrayList<>();
        listname.add(10);
        listname.add(20);
        listname.add(30);
        System.out.println(listname);
        listname.add(3,50);
        System.out.println(listname);
        System.out.println(listname.get(0));
        System.out.println(listname.remove(1));
        System.out.println(listname);
        listname.set(1,60);
        System.out.println(listname);
        System.out.println(listname.size());
        System.out.println(listname.contains(60));
    }
}
