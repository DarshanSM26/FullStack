interface program{
    default void demo(){
         System.out.println("Demo of java 8");
    }
}
class prog implements program{

}
public class Java8Interface {
    public static void main(String[] args) {
        program obj=new prog();
        obj.demo();
    }
}
