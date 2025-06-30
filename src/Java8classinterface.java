interface inter{
    default void demo(){
        System.out.println("Demo1 for interface");
    }
}
interface  interf {
    default void demo(){
        System.out.println("Demo2 for interface");
    }
}
class clss{
    public void demo(){
        System.out.println("Demo3 for class");
    }
}
public class Java8classinterface extends clss implements interf{
    public static void main(String[] args) {
        Java8classinterface obj=new Java8classinterface();
        obj.demo();
    }
}
