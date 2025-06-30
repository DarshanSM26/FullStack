import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Darshan");
        set.add("Shiva");
        set.add("Sanjay");
        set.add("Raj");
        set.add("Darshan");
        System.out.println(set);
        set.remove("Darshan");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains("Darshan"));
    }
}
