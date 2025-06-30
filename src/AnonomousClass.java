abstract class anonomous1{
   abstract void show();
}
public class AnonomousClass {
    public static void main(String[] args) {
        anonomous1 obj=new anonomous1() {
            @Override
            void show() {
                System.out.println("Anonomous Class");
            }
        };
        obj.show();
    }
}
