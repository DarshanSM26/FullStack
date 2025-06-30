interface anonomousInter{
    void add(int a,int b);
    void sub(int a,int b);
}
public class InterfaceExample {
    public static void main(String[] args) {
        anonomousInter obj=new anonomousInter() {
            @Override
            public void add(int a, int b) {
                System.out.println("Add of Sum " +a+b);
            }

            @Override
            public void sub(int a, int b) {
                System.out.println("Sub of sum : " +(a-b));
            }
        };
        obj.add(3,4);
        obj.sub(5,4);
    }
}
