abstract class parentclass1{
    abstract void greet();
}
class childabstract extends parentclass1{
    void greet(){
        System.out.println("Welcome");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        childabstract obj=new childabstract();
        obj.greet();
    }
}
