interface demoA{
    static void show(){
        System.out.println("static methods");
    }
    default void display(){
        System.out.println("Default Methods");
    }
}
class demoB implements demoA{
    @Override
    public void display() {
        System.out.println("Default Methods");
    }
}
public class StaticAnddefaultMethod {
    public static void main(String[] args) {
        demoA.show();
        demoB obj=new demoB();
        obj.display();
    }
}
