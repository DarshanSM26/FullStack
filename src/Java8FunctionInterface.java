import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class con implements Consumer<Integer>{

    public void accept(Integer integer) {
        System.out.println(integer);
    }
}*/
public class Java8FunctionInterface {
    public static void main(String[] args) {
       /* List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> obj= new con();
        list.forEach(obj);*/
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> obj=  integer->System.out.println(integer);
        list.forEach(obj);

    }
}
