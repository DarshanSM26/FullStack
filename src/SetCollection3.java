import java.util.Set;
import java.util.TreeSet;

public class SetCollection3 {
    public static void main(String[] args) {
        Set<Integer> number=new TreeSet<>();
        number.add(8);
        number.add(8);
        number.add(8);
        number.add(4);
        number.add(4);
        number.add(9);
        System.out.println(number);
    }
}
