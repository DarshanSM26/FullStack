class ProtectedAccess{
    protected void display(){
        System.out.println("Hello");
    }
}
public class protectedAccessmodifies {
    public static void main(String[] args) {
        ProtectedAccess obj=new ProtectedAccess();
        obj.display();
    }
}
