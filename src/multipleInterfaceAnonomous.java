interface MIA{
    void add(int a,int b);
}
interface MIA1{
    void sub(int a, int b);
}
public class multipleInterfaceAnonomous {
    public static void main(String[] args) {
        MIA obj=new MIA() {
            @Override
            public void add(int a, int b) {
                System.out.println("Add of sum :"+ a+b);
            }
        };
        obj.add(4,5);
        MIA1 obj1=new MIA1() {
            @Override
            public void sub(int a, int b) {
                System.out.println("Sub of sum: "+ (a-b));
            }
        };
        obj1.sub(4,6);
    }
}
