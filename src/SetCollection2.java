import java.awt.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollection2 {
    public static void main(String[] args) {
        Set<String> wild=new LinkedHashSet<>();
        wild.add("Cat");
        wild.add("Dog");
        wild.add("Cow");
        wild.add("Lion");
        wild.add("Tiger");
        System.out.println(wild);
        System.out.println(wild.size());
        System.out.println(wild.contains("Lion"));
        System.out.println(wild.remove("Cat"));
        System.out.println(wild.size());
    }
}
