import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class SetCollection1 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(6);
        set.add(9);
        set.add(15);
        set.add(26);
        set.add(1);
        set.add(1);
        System.out.println(set);
        System.out.println(set.remove(6));
        System.out.println(set.size());
        System.out.println(set.contains(2));
    }
}
