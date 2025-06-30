import java.util.ArrayList;
import java.util.List;

public class Java8ForEachMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(1);
        list.forEach(i -> System.out.println(i));

    }
}
