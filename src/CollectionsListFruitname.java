import java.util.ArrayList;
import java.util.List;

public class CollectionsListFruitname {
    public static void main(String[] args) {
        List<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orage");
        fruit.add("Ice apple");
        fruit.add("jackfruit");
        fruit.add("green apple");
        System.out.println(fruit);
        System.out.println(fruit.get(3));
        System.out.println(fruit.remove(1));
        System.out.println(fruit.size());
        System.out.println(fruit.contains("Ice apple"));
    }
}
