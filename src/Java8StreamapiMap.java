import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8StreamapiMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        Integer sum = list.stream().filter( i -> i%2==0).map( i -> i*2).reduce(0,( i,  j)-> i+j);
                //.forEach(System.out::println);
        System.out.println(sum);
    }
}
