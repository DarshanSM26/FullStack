import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Streamapi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        Stream s1=list.stream();
        s1.forEach(System.out::println);     ///s1.forEach(i->System.out.println()); like this it will work.
    }
}
