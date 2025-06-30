class parentclass{
    public void mobile(){
        System.out.println("Nokia");
    }
}
class childclass extends parentclass
{
    public void mobile(){
        System.out.println("Iphone");
    }
}
public class MethodOveriding {
    public static void main(String[] args) {
        childclass obj=new childclass();
        obj.mobile();
    }
}

