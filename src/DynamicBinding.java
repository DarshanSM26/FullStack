class parentdy{
    void parent(){
        System.out.println("Parent class ");
    }
}
class childdy extends parentdy{
    @Override
    void parent() {
        super.parent();
        System.out.println("Child class");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        parentdy obj=new childdy();
        obj.parent();
    }
}
