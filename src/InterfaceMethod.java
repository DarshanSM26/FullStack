interface A1{
    public void display();
}
class B1 implements A1{
    @Override
    public void display() {
        System.out.println("Fetch the deatils");
    }
}
public class InterfaceMethod {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.display();
    }
}
