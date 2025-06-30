class parent{
    public void A(){
        System.out.println("Parent features");
    }
}
class child extends parent{
    public void B(){
        System.out.println("Child features");
    }
    public void C(){
        System.out.println("Exet featueres");
    }
}
public class SingleInherit {
    public static void main(String[] args) {
        child obj=new child();
        obj.A();
        obj.B();
        obj.C();
    }
}
